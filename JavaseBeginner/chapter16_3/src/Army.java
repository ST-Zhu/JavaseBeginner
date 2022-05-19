public class Army {
    private Weapon[] w;
    private int count;

    public Army(int i) {
        this.count = 0;
        this.w = new Weapon[i];
        for (int j = 0; j < this.w.length; j++) {
            this.w[j] = new Weapon();
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Weapon[] getW() {
        return w;
    }

    public void setW(Weapon[] w) {
        this.w = w;
    }

    public void moveAll(){
        for (int i = 0; i < this.w.length; i++) {
            if ((this.w[i] instanceof MoveWeapon) || (this.w[i] instanceof MoveAttackWeapon)){
                try {
                    this.w[i].move();
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void attackAll(){
        for (int i = 0; i < this.w.length; i++) {
            if ((this.w[i] instanceof AttackWeapon) || (this.w[i] instanceof MoveAttackWeapon)){
                try {
                    this.w[i].attack();
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void addWeapon(Weapon wa) throws MyException {
        if (this.count < this.w.length){
            this.w[this.count] = wa;
            this.count ++;
            System.out.println(wa.getName() + "已添加。");
        }else{
            this.count = this.w.length;
            throw new MyException(wa.getName() + "添加失败，武器数量已满。");
        }
    }

    public void deleteWeapon(Weapon wa) throws MyException {
        for (int i = 0; i < this.getW().length; i++) {
            if (wa.getName() == this.getW()[i].getName()){
                this.getW()[i] = new Weapon();
                System.out.println(wa.getName() + "删除成功。");
                return;
            }
        }
        throw new MyException("军队中无该武器。");
    }
}
