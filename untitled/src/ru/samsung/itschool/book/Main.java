class Example {
    int i = 0;

    Example inc() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Example x = new Example();
        x.inc().inc().inc().print();

    }
}
