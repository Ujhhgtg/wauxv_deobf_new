package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0788 {

    public static final SparseIntArray f2984;

    public boolean f2985;

    public int f2986;

    public int f2987;

    public int f2988;

    public int f2989;

    public float f2990;

    public int f2991;

    public int f2992;

    public int f2993;

    public int f2994;

    public int f2995;

    public int f2996;

    public int f2997;

    public int f2998;

    public int f2999;

    public int f3000;

    public int f3001;

    public int f3002;

    public int f3003;

    public float f3004;

    public float f3005;

    public String f3006;

    public int f3007;

    public int f3008;

    public float f3009;

    public int f3010;

    public int f3011;

    public int f3012;

    public int f3013;

    public int f3014;

    public int f3015;

    public int f3016;

    public int f3017;

    public int f3018;

    public int f3019;

    public int f3020;

    public int f3021;

    public int f3022;

    public int f3023;

    public int f3024;

    public float f3025;

    public float f3026;

    public int f3027;

    public int f3028;

    public int f3029;

    public int f3030;

    public int f3031;

    public int f3032;

    public int f3033;

    public int f3034;

    public float f3035;

    public float f3036;

    public int f3037;

    public int f3038;

    public int f3039;

    public int[] f3040;

    public String f3041;

    public String f3042;

    public boolean f3043;

    public boolean f3044;

    public boolean f3045;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2984 = sparseIntArray;
        sparseIntArray.append(39, 24);
        sparseIntArray.append(40, 25);
        sparseIntArray.append(42, 28);
        sparseIntArray.append(43, 29);
        sparseIntArray.append(48, 35);
        sparseIntArray.append(47, 34);
        sparseIntArray.append(21, 4);
        sparseIntArray.append(20, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(56, 6);
        sparseIntArray.append(57, 7);
        sparseIntArray.append(28, 17);
        sparseIntArray.append(29, 18);
        sparseIntArray.append(30, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(44, 31);
        sparseIntArray.append(45, 32);
        sparseIntArray.append(27, 10);
        sparseIntArray.append(26, 9);
        sparseIntArray.append(60, 13);
        sparseIntArray.append(63, 16);
        sparseIntArray.append(61, 14);
        sparseIntArray.append(58, 11);
        sparseIntArray.append(62, 15);
        sparseIntArray.append(59, 12);
        sparseIntArray.append(51, 38);
        sparseIntArray.append(37, 37);
        sparseIntArray.append(36, 39);
        sparseIntArray.append(50, 40);
        sparseIntArray.append(35, 20);
        sparseIntArray.append(49, 36);
        sparseIntArray.append(25, 5);
        sparseIntArray.append(38, 76);
        sparseIntArray.append(46, 76);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(19, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(22, 61);
        sparseIntArray.append(24, 62);
        sparseIntArray.append(23, 63);
        sparseIntArray.append(55, 69);
        sparseIntArray.append(34, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void m2295(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2461.f7812);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = f2984;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.f3043 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3043);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.f2999 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2999);
                        break;
                    case 2:
                        this.f3016 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3016);
                        break;
                    case 3:
                        this.f2998 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2998);
                        break;
                    case 4:
                        this.f2997 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2997);
                        break;
                    case 5:
                        this.f3006 = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f3010 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3010);
                        break;
                    case 7:
                        this.f3011 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3011);
                        break;
                    case 8:
                        this.f3017 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3017);
                        break;
                    case 9:
                        this.f3003 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f3003);
                        break;
                    case 10:
                        this.f3002 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f3002);
                        break;
                    case 11:
                        this.f3022 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3022);
                        break;
                    case 12 /* 12 */:
                        this.f3023 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3023);
                        break;
                    case 13:
                        this.f3019 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3019);
                        break;
                    case 14 /* 14 */:
                        this.f3021 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3021);
                        break;
                    case 15:
                        this.f3024 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3024);
                        break;
                    case 16:
                        this.f3020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3020);
                        break;
                    case 17 /* 17 */:
                        this.f2988 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2988);
                        break;
                    case 18 /* 18 */:
                        this.f2989 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2989);
                        break;
                    case 19:
                        this.f2990 = typedArrayObtainStyledAttributes.getFloat(index, this.f2990);
                        break;
                    case 20:
                        this.f3004 = typedArrayObtainStyledAttributes.getFloat(index, this.f3004);
                        break;
                    case 21 /* 21 */:
                        this.f2987 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2987);
                        break;
                    case 22 /* 22 */:
                        this.f2986 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2986);
                        break;
                    case 23 /* 23 */:
                        this.f3013 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3013);
                        break;
                    case 24 /* 24 */:
                        this.f2991 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2991);
                        break;
                    case 25 /* 25 */:
                        this.f2992 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2992);
                        break;
                    case 26:
                        this.f3012 = typedArrayObtainStyledAttributes.getInt(index, this.f3012);
                        break;
                    case 27:
                        this.f3014 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3014);
                        break;
                    case 28:
                        this.f2993 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2993);
                        break;
                    case 29:
                        this.f2994 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2994);
                        break;
                    case 30:
                        this.f3018 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3018);
                        break;
                    case 31:
                        this.f3000 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f3000);
                        break;
                    case 32:
                        this.f3001 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f3001);
                        break;
                    case 33:
                        this.f3015 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3015);
                        break;
                    case 34:
                        this.f2996 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2996);
                        break;
                    case 35:
                        this.f2995 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f2995);
                        break;
                    case 36:
                        this.f3005 = typedArrayObtainStyledAttributes.getFloat(index, this.f3005);
                        break;
                    case 37:
                        this.f3026 = typedArrayObtainStyledAttributes.getFloat(index, this.f3026);
                        break;
                    case 38:
                        this.f3025 = typedArrayObtainStyledAttributes.getFloat(index, this.f3025);
                        break;
                    case 39:
                        this.f3027 = typedArrayObtainStyledAttributes.getInt(index, this.f3027);
                        break;
                    case 40:
                        this.f3028 = typedArrayObtainStyledAttributes.getInt(index, this.f3028);
                        break;
                    default:
                        switch (i2) {
                            case 54 /* 54 */:
                                this.f3029 = typedArrayObtainStyledAttributes.getInt(index, this.f3029);
                                break;
                            case 55 /* 55 */:
                                this.f3030 = typedArrayObtainStyledAttributes.getInt(index, this.f3030);
                                break;
                            case 56 /* 56 */:
                                this.f3031 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3031);
                                break;
                            case 57 /* 57 */:
                                this.f3032 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3032);
                                break;
                            case 58 /* 58 */:
                                this.f3033 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3033);
                                break;
                            case 59:
                                this.f3034 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3034);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f3007 = C0792.m2301(typedArrayObtainStyledAttributes, index, this.f3007);
                                        break;
                                    case 62:
                                        this.f3008 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3008);
                                        break;
                                    case 63:
                                        this.f3009 = typedArrayObtainStyledAttributes.getFloat(index, this.f3009);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.f3035 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.f3036 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.f3037 = typedArrayObtainStyledAttributes.getInt(index, this.f3037);
                                                break;
                                            case 73:
                                                this.f3038 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3038);
                                                break;
                                            case 74:
                                                this.f3041 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f3045 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3045);
                                                break;
                                            case 76:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.f3042 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.f3044 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3044);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
