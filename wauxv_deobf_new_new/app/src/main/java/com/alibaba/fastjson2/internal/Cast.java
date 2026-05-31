package com.alibaba.fastjson2.internal;

import com.alibaba.fastjson2.JSONException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Cast {
    private static JSONException errorToBigDecimal(Object obj) {
        return new JSONException("Cannot convert " + obj + " to BigDecimal");
    }

    private static JSONException errorToBigInteger(Object obj) {
        return new JSONException("Cannot convert " + obj + " to BigInteger");
    }

    private static JSONException errorToBoolean(Object obj) {
        return new JSONException("Cannot convert " + obj + " to boolean");
    }

    private static JSONException errorToByte(Object obj) {
        return new JSONException("Cannot convert " + obj + " to byte");
    }

    private static JSONException errorToChar(Object obj) {
        return new JSONException("Cannot convert " + obj + " to char");
    }

    private static JSONException errorToDouble(Object obj) {
        return new JSONException("Cannot convert " + obj + " to double");
    }

    private static JSONException errorToFloat(Object obj) {
        return new JSONException("Cannot convert " + obj + " to float");
    }

    private static JSONException errorToInt(Object obj) {
        return new JSONException("Cannot convert " + obj + " to int");
    }

    private static JSONException errorToLong(Object obj) {
        return new JSONException("Cannot convert " + obj + " to long");
    }

    private static JSONException errorToNumber(Object obj) {
        return new JSONException("Cannot convert " + obj + " to Number");
    }

    private static JSONException errorToShort(Object obj) {
        return new JSONException("Cannot convert " + obj + " to short");
    }

    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof BigDecimal ? (BigDecimal) obj : toBigDecimalEx(obj);
    }

    private static BigDecimal toBigDecimalEx(Object obj) {
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (obj instanceof Number) {
            return ((obj instanceof Float) || (obj instanceof Double)) ? BigDecimal.valueOf(((Number) obj).doubleValue()) : new BigDecimal(obj.toString());
        }
        if (obj instanceof Boolean) {
            return BigDecimal.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Character) {
            return BigDecimal.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return new BigDecimal((String) obj);
        }
        if (obj == null) {
            return BigDecimal.ZERO;
        }
        throw errorToBigDecimal(obj);
    }

    public static BigInteger toBigInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof BigInteger ? (BigInteger) obj : toBigIntegerEx(obj);
    }

    private static BigInteger toBigIntegerEx(Object obj) {
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        if (obj instanceof Number) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return BigInteger.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Character) {
            return BigInteger.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return new BigInteger((String) obj);
        }
        throw errorToBigInteger(obj);
    }

    public static Boolean toBoolean(Object obj) {
        return (obj == null || (obj instanceof Boolean)) ? (Boolean) obj : Boolean.valueOf(toBooleanEx(obj));
    }

    private static boolean toBooleanEx(Object obj) {
        if (obj instanceof BigInteger) {
            return toBooleanValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toBooleanValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue() != 0;
        }
        if (obj instanceof String) {
            return toBooleanValue((String) obj);
        }
        if (obj == null) {
            return false;
        }
        throw errorToBoolean(obj);
    }

    public static boolean toBooleanValue(byte b) {
        return b != 0;
    }

    public static Byte toByte(Object obj) {
        return (obj == null || (obj instanceof Byte)) ? (Byte) obj : Byte.valueOf(toByteEx(obj));
    }

    private static byte toByteEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0;
        }
        if (obj instanceof Character) {
            return (byte) ((Character) obj).charValue();
        }
        if (obj instanceof String) {
            return toByteValue((String) obj);
        }
        if (obj instanceof Number) {
            return toByteValue(((Number) obj).doubleValue());
        }
        if (obj == null) {
            return (byte) 0;
        }
        throw errorToByte(obj);
    }

    public static byte toByteValue(char c) {
        return (byte) c;
    }

    private static char toCharEx(Object obj) {
        if (obj instanceof Short) {
            return toCharValue(((Short) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return toCharValue(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return toCharValue(((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            return toCharValue(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return toCharValue(((Double) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (char) 1 : (char) 0;
        }
        if (obj instanceof String) {
            return toCharValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toCharValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toCharValue((BigDecimal) obj);
        }
        if (obj == null) {
            return (char) 0;
        }
        throw errorToChar(obj);
    }

    public static char toCharValue(double d) {
        return (char) d;
    }

    public static Character toCharacter(Object obj) {
        return (obj == null || (obj instanceof Character)) ? (Character) obj : Character.valueOf(toCharEx(obj));
    }

    public static Double toDouble(Object obj) {
        return (obj == null || (obj instanceof Double)) ? (Double) obj : Double.valueOf(toDoubleEx(obj));
    }

    private static double toDoubleEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        if (obj instanceof Character) {
            return toDoubleValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toDoubleValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toDoubleValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toDoubleValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj == null) {
            return 0.0d;
        }
        throw errorToDouble(obj);
    }

    public static double toDoubleValue(int i) {
        return i;
    }

    public static Float toFloat(Object obj) {
        return (obj == null || (obj instanceof Float)) ? (Float) obj : Float.valueOf(toFloatEx(obj));
    }

    private static float toFloatEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
        }
        if (obj instanceof Character) {
            return toFloatValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toFloatValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toFloatValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toFloatValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj == null) {
            return 0.0f;
        }
        throw errorToFloat(obj);
    }

    public static float toFloatValue(char c) {
        return c;
    }

    private static int toIntEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof Character) {
            return toIntValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toIntValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toIntValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toIntValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toIntValue(((Number) obj).intValue());
        }
        if (obj == null) {
            return 0;
        }
        throw errorToInt(obj);
    }

    public static int toIntValue(double d) {
        return (int) d;
    }

    public static Integer toInteger(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf(toIntEx(obj));
    }

    public static Long toLong(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(toLongEx(obj));
    }

    private static long toLongEx(Object obj) {
        if (obj instanceof Boolean) {
            return toLongValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Character) {
            return toLongValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toLongValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toLongValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toLongValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toLongValue(((Number) obj).longValue());
        }
        if (obj == null) {
            return 0L;
        }
        throw errorToLong(obj);
    }

    public static long toLongValue(char c) {
        return c;
    }

    public static Number toNumber(BigDecimal bigDecimal) {
        return bigDecimal;
    }

    private static Number toNumberEx(Object obj) {
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Character) {
            return Double.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                if (!str.contains(".") && !str.toLowerCase().contains("e")) {
                    return Long.valueOf(Long.parseLong(str));
                }
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                throw errorToNumber(obj);
            }
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj == null) {
            return null;
        }
        throw errorToNumber(obj);
    }

    public static Short toShort(Object obj) {
        return (obj == null || (obj instanceof Short)) ? (Short) obj : Short.valueOf(toShortEx(obj));
    }

    private static short toShortEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (short) 1 : (short) 0;
        }
        if (obj instanceof Character) {
            return (short) ((Character) obj).charValue();
        }
        if (obj instanceof String) {
            return toShortValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toShortValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toShortValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toShortValue((int) ((Number) obj).shortValue());
        }
        if (obj == null) {
            return (short) 0;
        }
        throw errorToShort(obj);
    }

    public static short toShortValue(char c) {
        return (short) c;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static boolean toBooleanValue(char c) {
        return c == '1' || c == 't' || c == 'T';
    }

    public static byte toByteValue(double d) {
        return (byte) d;
    }

    public static char toCharValue(float f) {
        return (char) f;
    }

    public static double toDoubleValue(long j) {
        return j;
    }

    public static float toFloatValue(double d) {
        return (float) d;
    }

    public static int toIntValue(float f) {
        return (int) f;
    }

    public static long toLongValue(double d) {
        return (long) d;
    }

    public static Number toNumber(BigInteger bigInteger) {
        return bigInteger;
    }

    public static short toShortValue(double d) {
        return (short) d;
    }

    public static String toString(byte b) {
        return String.valueOf((int) b);
    }

    public static boolean toBooleanValue(double d) {
        return d != 0.0d;
    }

    public static byte toByteValue(float f) {
        return (byte) f;
    }

    public static char toCharValue(int i) {
        return (char) i;
    }

    public static double toDoubleValue(boolean z) {
        return z ? 1.0d : 0.0d;
    }

    public static float toFloatValue(int i) {
        return i;
    }

    public static int toIntValue(long j) {
        return (int) j;
    }

    public static long toLongValue(float f) {
        return (long) f;
    }

    public static Number toNumber(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            return toNumberEx(obj);
        }
        return (Number) obj;
    }

    public static short toShortValue(float f) {
        return (short) f;
    }

    public static String toString(short s) {
        return String.valueOf((int) s);
    }

    public static BigDecimal toBigDecimal(byte b) {
        return BigDecimal.valueOf(b);
    }

    public static BigInteger toBigInteger(byte b) {
        return BigInteger.valueOf(b);
    }

    public static boolean toBooleanValue(float f) {
        return f != 0.0f;
    }

    public static byte toByteValue(int i) {
        return (byte) i;
    }

    public static char toCharValue(long j) {
        return (char) j;
    }

    public static double toDoubleValue(Object obj) {
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return toDoubleEx(obj);
    }

    public static float toFloatValue(long j) {
        return j;
    }

    public static int toIntValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return toIntEx(obj);
    }

    public static long toLongValue(int i) {
        return i;
    }

    public static short toShortValue(int i) {
        return (short) i;
    }

    public static String toString(char c) {
        return String.valueOf(c);
    }

    public static BigDecimal toBigDecimal(short s) {
        return BigDecimal.valueOf(s);
    }

    public static BigInteger toBigInteger(short s) {
        return BigInteger.valueOf(s);
    }

    public static boolean toBooleanValue(int i) {
        return i != 0;
    }

    public static byte toByteValue(long j) {
        return (byte) j;
    }

    public static char toCharValue(short s) {
        return (char) s;
    }

    public static float toFloatValue(short s) {
        return s;
    }

    public static long toLongValue(short s) {
        return s;
    }

    public static short toShortValue(long j) {
        return (short) j;
    }

    public static String toString(int i) {
        return String.valueOf(i);
    }

    public static BigDecimal toBigDecimal(char c) {
        return BigDecimal.valueOf(c);
    }

    public static BigInteger toBigInteger(char c) {
        return BigInteger.valueOf(c);
    }

    public static boolean toBooleanValue(long j) {
        return j != 0;
    }

    public static byte toByteValue(short s) {
        return (byte) s;
    }

    public static char toCharValue(boolean z) {
        return z ? '1' : '0';
    }

    public static float toFloatValue(boolean z) {
        return z ? 1.0f : 0.0f;
    }

    public static long toLongValue(boolean z) {
        return z ? 1L : 0L;
    }

    public static Number toNumber(byte b) {
        return Byte.valueOf(b);
    }

    public static short toShortValue(boolean z) {
        return z ? (short) 1 : (short) 0;
    }

    public static String toString(long j) {
        return String.valueOf(j);
    }

    public static BigDecimal toBigDecimal(int i) {
        return BigDecimal.valueOf(i);
    }

    public static BigInteger toBigInteger(int i) {
        return BigInteger.valueOf(i);
    }

    public static boolean toBooleanValue(short s) {
        return s != 0;
    }

    public static byte toByteValue(boolean z) {
        return z ? (byte) 1 : (byte) 0;
    }

    public static char toCharValue(Object obj) {
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        return toCharEx(obj);
    }

    public static double toDoubleValue(char c) {
        if (c < '0' || c > '9') {
            throw errorToDouble(Character.valueOf(c));
        }
        return c - '0';
    }

    public static float toFloatValue(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return toFloatEx(obj);
    }

    public static int toIntValue(char c) {
        if (c < '0' || c > '9') {
            throw errorToInt(Character.valueOf(c));
        }
        return c - '0';
    }

    public static long toLongValue(Object obj) {
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return toLongEx(obj);
    }

    public static Number toNumber(short s) {
        return Short.valueOf(s);
    }

    public static short toShortValue(Object obj) {
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        return toShortEx(obj);
    }

    public static String toString(float f) {
        return String.valueOf(f);
    }

    public static BigDecimal toBigDecimal(long j) {
        return BigDecimal.valueOf(j);
    }

    public static BigInteger toBigInteger(long j) {
        return BigInteger.valueOf(j);
    }

    public static boolean toBooleanValue(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return toBooleanEx(obj);
    }

    public static byte toByteValue(Object obj) {
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        return toByteEx(obj);
    }

    public static double toDoubleValue(String str) {
        if (str == null) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            throw errorToDouble(str);
        }
    }

    public static int toIntValue(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw errorToInt(str);
        }
    }

    public static Number toNumber(char c) {
        return Integer.valueOf(c);
    }

    public static String toString(double d) {
        return String.valueOf(d);
    }

    public static BigDecimal toBigDecimal(float f) {
        return BigDecimal.valueOf(f);
    }

    public static BigInteger toBigInteger(float f) {
        return BigInteger.valueOf((long) f);
    }

    public static Number toNumber(int i) {
        return Integer.valueOf(i);
    }

    public static String toString(boolean z) {
        return String.valueOf(z);
    }

    public static BigDecimal toBigDecimal(double d) {
        return BigDecimal.valueOf(d);
    }

    public static BigInteger toBigInteger(double d) {
        return BigInteger.valueOf((long) d);
    }

    public static char toCharValue(String str) {
        if (str == null) {
            return (char) 0;
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        try {
            return (char) Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw errorToChar(str);
        }
    }

    public static double toDoubleValue(BigInteger bigInteger) {
        return bigInteger.doubleValue();
    }

    public static float toFloatValue(String str) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            throw errorToFloat(str);
        }
    }

    public static int toIntValue(BigInteger bigInteger) {
        return bigInteger.intValue();
    }

    public static long toLongValue(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            throw errorToLong(str);
        }
    }

    public static Number toNumber(long j) {
        return Long.valueOf(j);
    }

    public static short toShortValue(String str) {
        if (str == null) {
            return (short) 0;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            throw errorToShort(str);
        }
    }

    public static String toString(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        return bigInteger.toString();
    }

    public static BigDecimal toBigDecimal(boolean z) {
        return z ? BigDecimal.ONE : BigDecimal.ZERO;
    }

    public static BigInteger toBigInteger(boolean z) {
        return z ? BigInteger.ONE : BigInteger.ZERO;
    }

    public static boolean toBooleanValue(String str) {
        if (str == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    public static byte toByteValue(String str) {
        if (str == null) {
            return (byte) 0;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            throw errorToByte(str);
        }
    }

    public static double toDoubleValue(BigDecimal bigDecimal) {
        return bigDecimal.doubleValue();
    }

    public static int toIntValue(BigDecimal bigDecimal) {
        return bigDecimal.intValue();
    }

    public static Number toNumber(float f) {
        return Float.valueOf(f);
    }

    public static String toString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        return bigDecimal.toString();
    }

    public static BigDecimal toBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw errorToBigDecimal(str);
        }
    }

    public static BigInteger toBigInteger(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException unused) {
            throw errorToBigInteger(str);
        }
    }

    public static boolean toBooleanValue(BigInteger bigInteger) {
        return !bigInteger.equals(BigInteger.ZERO);
    }

    public static float toFloatValue(BigInteger bigInteger) {
        return bigInteger.floatValue();
    }

    public static long toLongValue(BigInteger bigInteger) {
        return bigInteger.longValue();
    }

    public static Number toNumber(double d) {
        return Double.valueOf(d);
    }

    public static short toShortValue(BigInteger bigInteger) {
        return bigInteger.shortValue();
    }

    public static boolean toBooleanValue(BigDecimal bigDecimal) {
        return bigDecimal.compareTo(BigDecimal.ZERO) != 0;
    }

    public static byte toByteValue(BigInteger bigInteger) {
        return bigInteger.byteValue();
    }

    public static float toFloatValue(BigDecimal bigDecimal) {
        return bigDecimal.floatValue();
    }

    public static long toLongValue(BigDecimal bigDecimal) {
        return bigDecimal.longValue();
    }

    public static Number toNumber(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    public static short toShortValue(BigDecimal bigDecimal) {
        return bigDecimal.shortValue();
    }

    public static byte toByteValue(BigDecimal bigDecimal) {
        return bigDecimal.byteValue();
    }

    public static char toCharValue(BigInteger bigInteger) {
        return (char) bigInteger.intValue();
    }

    public static Number toNumber(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (!str.contains(".") && !str.toLowerCase().contains("e")) {
                return Long.valueOf(Long.parseLong(str));
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            throw errorToNumber(str);
        }
    }

    public static char toCharValue(BigDecimal bigDecimal) {
        return (char) bigDecimal.intValue();
    }
}
