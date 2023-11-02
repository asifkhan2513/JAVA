public class Integerrange {
    public static void main(String[] args) {
        int Minimum = Integer.MIN_VALUE;
        int Maximum = Integer.MAX_VALUE;
        int Byte = Integer.BYTES;
        float cmax = Float.MAX_VALUE;
        float cmin = Float.MIN_VALUE;
        float cByte = Float.BYTES;
        long lmax= Long.MAX_VALUE;
        long lmin= Long.MIN_VALUE;
        long lByte= Long.BYTES;
        double dmax= Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        double dbyte= Double.BYTES;
        // byte jmin= Byte.MIN_VALUE;
        // byte jmax= Byte.MAX_VALUE;
        // byte jbyte= Byte.BYTES;

        System.out.println("Integer size is =  " + Byte + " And Range " + Minimum + " to " + Maximum);

        System.out.println("Float size is = " + cByte + " And the range is = " + cmin + " to " + cmax);

        System.out.println("Long size is = "+lByte+" to "+lmin+ " to " +lmax);

        System.out.println("Double size =  "+dbyte+ " And the Range is = "+dmin+ " to "+dmax);
    }
}
