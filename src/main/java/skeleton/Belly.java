package skeleton;

public class Belly {
    int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public void nap(int hours) {
        System.out.println("not really napin' ... lol");
        this.cukes -= hours*50;
        if (cukes<0){
            flush();
        }
    }
    public int flush() {
        int res = this.cukes;
        this.cukes=0;
        return res;
    }

}
