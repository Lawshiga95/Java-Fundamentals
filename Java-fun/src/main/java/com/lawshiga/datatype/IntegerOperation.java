package com.lawshiga.datatype;

import java.math.BigInteger;

public class IntegerOperation {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("13234567898765434567654345678987654543");
        BigInteger bigInteger1 = BigInteger.valueOf(3457654);//if the value is not that big use this

        BigInteger b1 = new BigInteger("22");
        b1.multiply(new BigInteger("55"));
        System.out.println(b1); // no effect since BigInteger is immutable

    BigInteger a1 = new BigInteger("100");
    BigInteger a2 = a1.multiply(new BigInteger("2")).
            add(new BigInteger("20")).
            divide(BigInteger.valueOf(6));
        System.out.println(a2);
    }
}
