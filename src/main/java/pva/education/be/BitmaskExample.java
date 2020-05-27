package pva.education.be;

public class BitmaskExample {
    public static void main(String[] args){
        BitmaskExample bitmaskExample = new BitmaskExample();
        bitmaskExample.run();
    }
    private void run(){
        add();
    }

    private void add(){
       // int a = 16;
        //int b = 4;
        Integer w = 4;

        int oct = 0123;
        int hex = 0x123;

        int permissionmask = 0b10110010;
        int readRight = 0b01000011;

        System.out.println( permissionmask + " & " + readRight + " = " + (permissionmask & readRight));

        if((permissionmask & readRight) == readRight){
            System.out.println("Yuhu");
        } else {
            System.out.println("Denied");
        }

        int addReadRight = 0b01000001;
        permissionmask = permissionmask | addReadRight;

        System.out.println( permissionmask + " & " + readRight + " = " + (permissionmask | readRight));

        if((permissionmask & readRight) == readRight){
            System.out.println("Yuhu");
        } else {
            System.out.println("Denied");
        }

        //System.out.println(a & b);
        //System.out.println(a | b);
        //System.out.println();
        //System.out.println(a + b);
    }


}
