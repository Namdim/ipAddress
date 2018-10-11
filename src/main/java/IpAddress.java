public class IpAddress {
    //ip consist of 4 parts: part1.part2.part3.part4
    private int part1, part2, part3, part4;

    public void setPart1(int part1){
        this.part1 = part1;
    }

    public void setPart2(int part2) {
        this.part2 = part2;
    }

    public void setPart3(int part3){
        this.part3 = part3;
    }

    public void setPart4(int part4) {
        this.part4 = part4;
    }

    public int getPart1() {
        return this.part1;
    }

    public int getPart2() {
        return this.part2;
    }

    public int getPart3() {
        return this.part3;
    }

    public int getPart4() {
        return this.part4;
    }
}
