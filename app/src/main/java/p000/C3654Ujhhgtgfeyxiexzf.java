package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3654Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f11565Ujhhgtgfeyxiexzf = {0, 4, 8};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final SparseIntArray f11566Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashMap f11567Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean f11568Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f11569Ujhhgtgfeyxiexzf = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11566Ujhhgtgfeyxiexzf = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(102, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(107, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(Opcodes.IDIV, 67);
        sparseIntArray.append(104, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(103, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(105, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(Opcodes.LDIV, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int[] m5313Ujhhgtgfeyxiexzf(C2479feyxiexzfUjhhgtg c2479feyxiexzfUjhhgtg, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c2479feyxiexzfUjhhgtg.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC0763feyxiexzfUjhhgtg.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c2479feyxiexzfUjhhgtg.isInEditMode() && (c2479feyxiexzfUjhhgtg.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c2479feyxiexzfUjhhgtg.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f210Ujhhgtgfeyxiexzf;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f210Ujhhgtgfeyxiexzf.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C3649Ujhhgtgfeyxiexzf m5314Ujhhgtgfeyxiexzf(Context context, AttributeSet attributeSet) {
        C3649Ujhhgtgfeyxiexzf c3649Ujhhgtgfeyxiexzf = new C3649Ujhhgtgfeyxiexzf();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0773feyxiexzfUjhhgtg.f3056Ujhhgtgfeyxiexzf);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C3651Ujhhgtgfeyxiexzf c3651Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11477Ujhhgtgfeyxiexzf;
            C3653Ujhhgtgfeyxiexzf c3653Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11479Ujhhgtgfeyxiexzf;
            C3650Ujhhgtgfeyxiexzf c3650Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf;
            if (index != 1 && 23 != index && 24 != index) {
                c3651Ujhhgtgfeyxiexzf.getClass();
                c3650Ujhhgtgfeyxiexzf.getClass();
                c3653Ujhhgtgfeyxiexzf.getClass();
            }
            SparseIntArray sparseIntArray = f11566Ujhhgtgfeyxiexzf;
            int i2 = sparseIntArray.get(index);
            C3652Ujhhgtgfeyxiexzf c3652Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11476Ujhhgtgfeyxiexzf;
            switch (i2) {
                case 1:
                    c3650Ujhhgtgfeyxiexzf.f11496Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11496Ujhhgtgfeyxiexzf);
                    break;
                case 2:
                    c3650Ujhhgtgfeyxiexzf.f11513feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11513feyxiexzfUjhhgtg);
                    break;
                case 3:
                    c3650Ujhhgtgfeyxiexzf.f11495Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11495Ujhhgtgfeyxiexzf);
                    break;
                case 4:
                    c3650Ujhhgtgfeyxiexzf.f11494Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11494Ujhhgtgfeyxiexzf);
                    break;
                case 5:
                    c3650Ujhhgtgfeyxiexzf.f11503Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c3650Ujhhgtgfeyxiexzf.f11507feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3650Ujhhgtgfeyxiexzf.f11507feyxiexzfUjhhgtg);
                    break;
                case 7:
                    c3650Ujhhgtgfeyxiexzf.f11508feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3650Ujhhgtgfeyxiexzf.f11508feyxiexzfUjhhgtg);
                    break;
                case 8:
                    c3650Ujhhgtgfeyxiexzf.f11514feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11514feyxiexzfUjhhgtg);
                    break;
                case 9:
                    c3650Ujhhgtgfeyxiexzf.f11500Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11500Ujhhgtgfeyxiexzf);
                    break;
                case 10:
                    c3650Ujhhgtgfeyxiexzf.f11499Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11499Ujhhgtgfeyxiexzf);
                    break;
                case 11:
                    c3650Ujhhgtgfeyxiexzf.f11519feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11519feyxiexzfUjhhgtg);
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c3650Ujhhgtgfeyxiexzf.f11520feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11520feyxiexzfUjhhgtg);
                    break;
                case 13:
                    c3650Ujhhgtgfeyxiexzf.f11516feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11516feyxiexzfUjhhgtg);
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c3650Ujhhgtgfeyxiexzf.f11518feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11518feyxiexzfUjhhgtg);
                    break;
                case 15:
                    c3650Ujhhgtgfeyxiexzf.f11521feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11521feyxiexzfUjhhgtg);
                    break;
                case 16:
                    c3650Ujhhgtgfeyxiexzf.f11517feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11517feyxiexzfUjhhgtg);
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c3650Ujhhgtgfeyxiexzf.f11485Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3650Ujhhgtgfeyxiexzf.f11485Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.LDC /* 18 */:
                    c3650Ujhhgtgfeyxiexzf.f11486Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c3650Ujhhgtgfeyxiexzf.f11486Ujhhgtgfeyxiexzf);
                    break;
                case 19:
                    c3650Ujhhgtgfeyxiexzf.f11487Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11487Ujhhgtgfeyxiexzf);
                    break;
                case 20:
                    c3650Ujhhgtgfeyxiexzf.f11501Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11501Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c3650Ujhhgtgfeyxiexzf.f11484Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getLayoutDimension(index, c3650Ujhhgtgfeyxiexzf.f11484Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.LLOAD /* 22 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c3652Ujhhgtgfeyxiexzf.f11548Ujhhgtgfeyxiexzf);
                    c3652Ujhhgtgfeyxiexzf.f11548Ujhhgtgfeyxiexzf = i3;
                    c3652Ujhhgtgfeyxiexzf.f11548Ujhhgtgfeyxiexzf = f11565Ujhhgtgfeyxiexzf[i3];
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c3650Ujhhgtgfeyxiexzf.f11483Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getLayoutDimension(index, c3650Ujhhgtgfeyxiexzf.f11483Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.DLOAD /* 24 */:
                    c3650Ujhhgtgfeyxiexzf.f11510feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11510feyxiexzfUjhhgtg);
                    break;
                case Opcodes.ALOAD /* 25 */:
                    c3650Ujhhgtgfeyxiexzf.f11488Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11488Ujhhgtgfeyxiexzf);
                    break;
                case 26:
                    c3650Ujhhgtgfeyxiexzf.f11489Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11489Ujhhgtgfeyxiexzf);
                    break;
                case 27:
                    c3650Ujhhgtgfeyxiexzf.f11509feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11509feyxiexzfUjhhgtg);
                    break;
                case 28:
                    c3650Ujhhgtgfeyxiexzf.f11511feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11511feyxiexzfUjhhgtg);
                    break;
                case 29:
                    c3650Ujhhgtgfeyxiexzf.f11490Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11490Ujhhgtgfeyxiexzf);
                    break;
                case 30:
                    c3650Ujhhgtgfeyxiexzf.f11491Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11491Ujhhgtgfeyxiexzf);
                    break;
                case 31:
                    c3650Ujhhgtgfeyxiexzf.f11515feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11515feyxiexzfUjhhgtg);
                    break;
                case 32:
                    c3650Ujhhgtgfeyxiexzf.f11497Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11497Ujhhgtgfeyxiexzf);
                    break;
                case 33:
                    c3650Ujhhgtgfeyxiexzf.f11498Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11498Ujhhgtgfeyxiexzf);
                    break;
                case 34:
                    c3650Ujhhgtgfeyxiexzf.f11512feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11512feyxiexzfUjhhgtg);
                    break;
                case 35:
                    c3650Ujhhgtgfeyxiexzf.f11493Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11493Ujhhgtgfeyxiexzf);
                    break;
                case 36:
                    c3650Ujhhgtgfeyxiexzf.f11492Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11492Ujhhgtgfeyxiexzf);
                    break;
                case 37:
                    c3650Ujhhgtgfeyxiexzf.f11502Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11502Ujhhgtgfeyxiexzf);
                    break;
                case 38:
                    c3649Ujhhgtgfeyxiexzf.f11475Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getResourceId(index, c3649Ujhhgtgfeyxiexzf.f11475Ujhhgtgfeyxiexzf);
                    break;
                case 39:
                    c3650Ujhhgtgfeyxiexzf.f11523feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11523feyxiexzfUjhhgtg);
                    break;
                case 40:
                    c3650Ujhhgtgfeyxiexzf.f11522feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11522feyxiexzfUjhhgtg);
                    break;
                case 41:
                    c3650Ujhhgtgfeyxiexzf.f11524feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11524feyxiexzfUjhhgtg);
                    break;
                case 42:
                    c3650Ujhhgtgfeyxiexzf.f11525feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11525feyxiexzfUjhhgtg);
                    break;
                case 43:
                    c3652Ujhhgtgfeyxiexzf.f11550Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3652Ujhhgtgfeyxiexzf.f11550Ujhhgtgfeyxiexzf);
                    break;
                case 44:
                    c3653Ujhhgtgfeyxiexzf.f11563Ujhhgtgfeyxiexzf = true;
                    c3653Ujhhgtgfeyxiexzf.f11564Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11564Ujhhgtgfeyxiexzf);
                    break;
                case 45:
                    c3653Ujhhgtgfeyxiexzf.f11554Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3653Ujhhgtgfeyxiexzf.f11554Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.IALOAD /* 46 */:
                    c3653Ujhhgtgfeyxiexzf.f11555Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3653Ujhhgtgfeyxiexzf.f11555Ujhhgtgfeyxiexzf);
                    break;
                case 47:
                    c3653Ujhhgtgfeyxiexzf.f11556Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3653Ujhhgtgfeyxiexzf.f11556Ujhhgtgfeyxiexzf);
                    break;
                case 48:
                    c3653Ujhhgtgfeyxiexzf.f11557Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3653Ujhhgtgfeyxiexzf.f11557Ujhhgtgfeyxiexzf);
                    break;
                case 49:
                    c3653Ujhhgtgfeyxiexzf.f11558Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11558Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.AALOAD /* 50 */:
                    c3653Ujhhgtgfeyxiexzf.f11559Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11559Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.BALOAD /* 51 */:
                    c3653Ujhhgtgfeyxiexzf.f11560Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11560Ujhhgtgfeyxiexzf);
                    break;
                case 52:
                    c3653Ujhhgtgfeyxiexzf.f11561Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11561Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.SALOAD /* 53 */:
                    c3653Ujhhgtgfeyxiexzf.f11562Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimension(index, c3653Ujhhgtgfeyxiexzf.f11562Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.ISTORE /* 54 */:
                    c3650Ujhhgtgfeyxiexzf.f11526feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11526feyxiexzfUjhhgtg);
                    break;
                case Opcodes.LSTORE /* 55 */:
                    c3650Ujhhgtgfeyxiexzf.f11527feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11527feyxiexzfUjhhgtg);
                    break;
                case Opcodes.FSTORE /* 56 */:
                    c3650Ujhhgtgfeyxiexzf.f11528feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11528feyxiexzfUjhhgtg);
                    break;
                case Opcodes.DSTORE /* 57 */:
                    c3650Ujhhgtgfeyxiexzf.f11529feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11529feyxiexzfUjhhgtg);
                    break;
                case Opcodes.ASTORE /* 58 */:
                    c3650Ujhhgtgfeyxiexzf.f11530Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11530Ujhhgtgfeyxiexzf);
                    break;
                case 59:
                    c3650Ujhhgtgfeyxiexzf.f11531Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11531Ujhhgtgfeyxiexzf);
                    break;
                case 60:
                    c3653Ujhhgtgfeyxiexzf.f11553Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3653Ujhhgtgfeyxiexzf.f11553Ujhhgtgfeyxiexzf);
                    break;
                case 61:
                    c3650Ujhhgtgfeyxiexzf.f11504Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3650Ujhhgtgfeyxiexzf.f11504Ujhhgtgfeyxiexzf);
                    break;
                case 62:
                    c3650Ujhhgtgfeyxiexzf.f11505Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11505Ujhhgtgfeyxiexzf);
                    break;
                case 63:
                    c3650Ujhhgtgfeyxiexzf.f11506feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getFloat(index, c3650Ujhhgtgfeyxiexzf.f11506feyxiexzfUjhhgtg);
                    break;
                case 64:
                    c3651Ujhhgtgfeyxiexzf.f11544Ujhhgtgfeyxiexzf = m5315Ujhhgtgfeyxiexzf(typedArrayObtainStyledAttributes, index, c3651Ujhhgtgfeyxiexzf.f11544Ujhhgtgfeyxiexzf);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c3651Ujhhgtgfeyxiexzf.getClass();
                    } else {
                        String str = AbstractC1246feyxiexzfUjhhgtg.f4591Ujhhgtgfeyxiexzf[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c3651Ujhhgtgfeyxiexzf.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c3651Ujhhgtgfeyxiexzf.getClass();
                    break;
                case 67:
                    c3651Ujhhgtgfeyxiexzf.f11547Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3651Ujhhgtgfeyxiexzf.f11547Ujhhgtgfeyxiexzf);
                    break;
                case 68:
                    c3652Ujhhgtgfeyxiexzf.f11551Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3652Ujhhgtgfeyxiexzf.f11551Ujhhgtgfeyxiexzf);
                    break;
                case 69:
                    c3650Ujhhgtgfeyxiexzf.f11532Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c3650Ujhhgtgfeyxiexzf.f11533Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c3650Ujhhgtgfeyxiexzf.f11534Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, c3650Ujhhgtgfeyxiexzf.f11534Ujhhgtgfeyxiexzf);
                    break;
                case 73:
                    c3650Ujhhgtgfeyxiexzf.f11535Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c3650Ujhhgtgfeyxiexzf.f11535Ujhhgtgfeyxiexzf);
                    break;
                case 74:
                    c3650Ujhhgtgfeyxiexzf.f11538feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c3650Ujhhgtgfeyxiexzf.f11542Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getBoolean(index, c3650Ujhhgtgfeyxiexzf.f11542Ujhhgtgfeyxiexzf);
                    break;
                case 76:
                    c3651Ujhhgtgfeyxiexzf.f11545Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, c3651Ujhhgtgfeyxiexzf.f11545Ujhhgtgfeyxiexzf);
                    break;
                case 77:
                    c3650Ujhhgtgfeyxiexzf.f11539feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c3652Ujhhgtgfeyxiexzf.f11549Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getInt(index, c3652Ujhhgtgfeyxiexzf.f11549Ujhhgtgfeyxiexzf);
                    break;
                case Opcodes.IASTORE /* 79 */:
                    c3651Ujhhgtgfeyxiexzf.f11546Ujhhgtgfeyxiexzf = typedArrayObtainStyledAttributes.getFloat(index, c3651Ujhhgtgfeyxiexzf.f11546Ujhhgtgfeyxiexzf);
                    break;
                case 80:
                    c3650Ujhhgtgfeyxiexzf.f11540feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(index, c3650Ujhhgtgfeyxiexzf.f11540feyxiexzfUjhhgtg);
                    break;
                case 81:
                    c3650Ujhhgtgfeyxiexzf.f11541feyxiexzfUjhhgtg = typedArrayObtainStyledAttributes.getBoolean(index, c3650Ujhhgtgfeyxiexzf.f11541feyxiexzfUjhhgtg);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c3649Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static int m5315Ujhhgtgfeyxiexzf(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m5316Ujhhgtgfeyxiexzf(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        String resourceEntryName;
        C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c3654Ujhhgtgfeyxiexzf.f11569Ujhhgtgfeyxiexzf;
        HashSet<Integer> hashSet2 = new HashSet(map.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c3654Ujhhgtgfeyxiexzf.f11568Ujhhgtgfeyxiexzf && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C3649Ujhhgtgfeyxiexzf c3649Ujhhgtgfeyxiexzf = (C3649Ujhhgtgfeyxiexzf) map.get(Integer.valueOf(id));
                        if (childAt instanceof C2479feyxiexzfUjhhgtg) {
                            c3649Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf.f11536feyxiexzfUjhhgtg = 1;
                        }
                        C3650Ujhhgtgfeyxiexzf c3650Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf;
                        C3652Ujhhgtgfeyxiexzf c3652Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11476Ujhhgtgfeyxiexzf;
                        C3653Ujhhgtgfeyxiexzf c3653Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11479Ujhhgtgfeyxiexzf;
                        int i5 = c3650Ujhhgtgfeyxiexzf.f11536feyxiexzfUjhhgtg;
                        if (i5 != -1 && i5 == 1) {
                            C2479feyxiexzfUjhhgtg c2479feyxiexzfUjhhgtg = (C2479feyxiexzfUjhhgtg) childAt;
                            c2479feyxiexzfUjhhgtg.setId(id);
                            c2479feyxiexzfUjhhgtg.setType(c3650Ujhhgtgfeyxiexzf.f11534Ujhhgtgfeyxiexzf);
                            c2479feyxiexzfUjhhgtg.setMargin(c3650Ujhhgtgfeyxiexzf.f11535Ujhhgtgfeyxiexzf);
                            c2479feyxiexzfUjhhgtg.setAllowsGoneWidget(c3650Ujhhgtgfeyxiexzf.f11542Ujhhgtgfeyxiexzf);
                            int[] iArr = c3650Ujhhgtgfeyxiexzf.f11537feyxiexzfUjhhgtg;
                            if (iArr != null) {
                                c2479feyxiexzfUjhhgtg.setReferencedIds(iArr);
                            } else {
                                String str = c3650Ujhhgtgfeyxiexzf.f11538feyxiexzfUjhhgtg;
                                if (str != null) {
                                    int[] iArrM5313Ujhhgtgfeyxiexzf = m5313Ujhhgtgfeyxiexzf(c2479feyxiexzfUjhhgtg, str);
                                    c3650Ujhhgtgfeyxiexzf.f11537feyxiexzfUjhhgtg = iArrM5313Ujhhgtgfeyxiexzf;
                                    c2479feyxiexzfUjhhgtg.setReferencedIds(iArrM5313Ujhhgtgfeyxiexzf);
                                }
                            }
                        }
                        C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
                        c3645Ujhhgtgfeyxiexzf.m5305Ujhhgtgfeyxiexzf();
                        c3649Ujhhgtgfeyxiexzf.m5308Ujhhgtgfeyxiexzf(c3645Ujhhgtgfeyxiexzf);
                        HashMap map2 = c3649Ujhhgtgfeyxiexzf.f11480Ujhhgtgfeyxiexzf;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C3642Ujhhgtgfeyxiexzf c3642Ujhhgtgfeyxiexzf = (C3642Ujhhgtgfeyxiexzf) map2.get(str2);
                            int i6 = childCount;
                            String strM2711Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("set", str2);
                            HashSet hashSet3 = hashSet2;
                            try {
                                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(c3642Ujhhgtgfeyxiexzf.f11382Ujhhgtgfeyxiexzf);
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iM2713feyxiexzfUjhhgtg) {
                                    case 0:
                                        i3 = i4;
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, cls2).invoke(childAt, Integer.valueOf(c3642Ujhhgtgfeyxiexzf.f11383Ujhhgtgfeyxiexzf));
                                        break;
                                    case 1:
                                        i3 = i4;
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, cls3).invoke(childAt, Float.valueOf(c3642Ujhhgtgfeyxiexzf.f11384Ujhhgtgfeyxiexzf));
                                        break;
                                    case 2:
                                        i3 = i4;
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, cls2).invoke(childAt, Integer.valueOf(c3642Ujhhgtgfeyxiexzf.f11387Ujhhgtgfeyxiexzf));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM2711Ujhhgtgfeyxiexzf, Drawable.class);
                                        i3 = i4;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c3642Ujhhgtgfeyxiexzf.f11387Ujhhgtgfeyxiexzf);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM2419Ujhhgtgfeyxiexzf.append(cls.getName());
                                            Log.e("TransitionLayout", sbM2419Ujhhgtgfeyxiexzf.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM2711Ujhhgtgfeyxiexzf);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            StringBuilder sbM2419Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM2419Ujhhgtgfeyxiexzf2.append(cls.getName());
                                            Log.e("TransitionLayout", sbM2419Ujhhgtgfeyxiexzf2.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, CharSequence.class).invoke(childAt, c3642Ujhhgtgfeyxiexzf.f11385Ujhhgtgfeyxiexzf);
                                        i3 = i4;
                                        break;
                                    case 5:
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c3642Ujhhgtgfeyxiexzf.f11386Ujhhgtgfeyxiexzf));
                                        i3 = i4;
                                        break;
                                    case 6:
                                        cls.getMethod(strM2711Ujhhgtgfeyxiexzf, cls3).invoke(childAt, Float.valueOf(c3642Ujhhgtgfeyxiexzf.f11384Ujhhgtgfeyxiexzf));
                                        i3 = i4;
                                        break;
                                    default:
                                        i3 = i4;
                                        break;
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                i3 = i4;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                i3 = i4;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                i3 = i4;
                            }
                            childCount = i6;
                            hashSet2 = hashSet3;
                            i4 = i3;
                        }
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        childAt.setLayoutParams(c3645Ujhhgtgfeyxiexzf);
                        if (c3652Ujhhgtgfeyxiexzf.f11549Ujhhgtgfeyxiexzf == 0) {
                            childAt.setVisibility(c3652Ujhhgtgfeyxiexzf.f11548Ujhhgtgfeyxiexzf);
                        }
                        childAt.setAlpha(c3652Ujhhgtgfeyxiexzf.f11550Ujhhgtgfeyxiexzf);
                        childAt.setRotation(c3653Ujhhgtgfeyxiexzf.f11553Ujhhgtgfeyxiexzf);
                        childAt.setRotationX(c3653Ujhhgtgfeyxiexzf.f11554Ujhhgtgfeyxiexzf);
                        childAt.setRotationY(c3653Ujhhgtgfeyxiexzf.f11555Ujhhgtgfeyxiexzf);
                        childAt.setScaleX(c3653Ujhhgtgfeyxiexzf.f11556Ujhhgtgfeyxiexzf);
                        childAt.setScaleY(c3653Ujhhgtgfeyxiexzf.f11557Ujhhgtgfeyxiexzf);
                        if (!Float.isNaN(c3653Ujhhgtgfeyxiexzf.f11558Ujhhgtgfeyxiexzf)) {
                            childAt.setPivotX(c3653Ujhhgtgfeyxiexzf.f11558Ujhhgtgfeyxiexzf);
                        }
                        if (!Float.isNaN(c3653Ujhhgtgfeyxiexzf.f11559Ujhhgtgfeyxiexzf)) {
                            childAt.setPivotY(c3653Ujhhgtgfeyxiexzf.f11559Ujhhgtgfeyxiexzf);
                        }
                        childAt.setTranslationX(c3653Ujhhgtgfeyxiexzf.f11560Ujhhgtgfeyxiexzf);
                        childAt.setTranslationY(c3653Ujhhgtgfeyxiexzf.f11561Ujhhgtgfeyxiexzf);
                        childAt.setTranslationZ(c3653Ujhhgtgfeyxiexzf.f11562Ujhhgtgfeyxiexzf);
                        if (c3653Ujhhgtgfeyxiexzf.f11563Ujhhgtgfeyxiexzf) {
                            childAt.setElevation(c3653Ujhhgtgfeyxiexzf.f11564Ujhhgtgfeyxiexzf);
                        }
                    } else {
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                c3654Ujhhgtgfeyxiexzf = this;
                childCount = i;
                hashSet2 = hashSet;
            }
            i = childCount;
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            c3654Ujhhgtgfeyxiexzf = this;
            childCount = i;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C3649Ujhhgtgfeyxiexzf c3649Ujhhgtgfeyxiexzf2 = (C3649Ujhhgtgfeyxiexzf) map.get(num);
            C3650Ujhhgtgfeyxiexzf c3650Ujhhgtgfeyxiexzf2 = c3649Ujhhgtgfeyxiexzf2.f11478Ujhhgtgfeyxiexzf;
            int i7 = c3650Ujhhgtgfeyxiexzf2.f11536feyxiexzfUjhhgtg;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout.getContext();
                C2479feyxiexzfUjhhgtg c2479feyxiexzfUjhhgtg2 = new C2479feyxiexzfUjhhgtg(context);
                c2479feyxiexzfUjhhgtg2.f11388Ujhhgtgfeyxiexzf = new int[32];
                c2479feyxiexzfUjhhgtg2.f11394Ujhhgtgfeyxiexzf = new HashMap();
                c2479feyxiexzfUjhhgtg2.f11390Ujhhgtgfeyxiexzf = context;
                C2480feyxiexzfUjhhgtg c2480feyxiexzfUjhhgtg = new C2480feyxiexzfUjhhgtg();
                c2480feyxiexzfUjhhgtg.f8107Ujhhgtgfeyxiexzf = 0;
                c2480feyxiexzfUjhhgtg.f8108feyxiexzfUjhhgtg = true;
                c2480feyxiexzfUjhhgtg.f8109Ujhhgtgfeyxiexzf = 0;
                c2480feyxiexzfUjhhgtg.f8110Ujhhgtgfeyxiexzf = false;
                c2479feyxiexzfUjhhgtg2.f8106Ujhhgtgfeyxiexzf = c2480feyxiexzfUjhhgtg;
                c2479feyxiexzfUjhhgtg2.f11391Ujhhgtgfeyxiexzf = c2480feyxiexzfUjhhgtg;
                c2479feyxiexzfUjhhgtg2.m5304Ujhhgtgfeyxiexzf();
                c2479feyxiexzfUjhhgtg2.setVisibility(8);
                c2479feyxiexzfUjhhgtg2.setId(num.intValue());
                int[] iArr2 = c3650Ujhhgtgfeyxiexzf2.f11537feyxiexzfUjhhgtg;
                if (iArr2 != null) {
                    c2479feyxiexzfUjhhgtg2.setReferencedIds(iArr2);
                } else {
                    String str3 = c3650Ujhhgtgfeyxiexzf2.f11538feyxiexzfUjhhgtg;
                    if (str3 != null) {
                        int[] iArrM5313Ujhhgtgfeyxiexzf2 = m5313Ujhhgtgfeyxiexzf(c2479feyxiexzfUjhhgtg2, str3);
                        c3650Ujhhgtgfeyxiexzf2.f11537feyxiexzfUjhhgtg = iArrM5313Ujhhgtgfeyxiexzf2;
                        c2479feyxiexzfUjhhgtg2.setReferencedIds(iArrM5313Ujhhgtgfeyxiexzf2);
                    }
                }
                c2479feyxiexzfUjhhgtg2.setType(c3650Ujhhgtgfeyxiexzf2.f11534Ujhhgtgfeyxiexzf);
                c2479feyxiexzfUjhhgtg2.setMargin(c3650Ujhhgtgfeyxiexzf2.f11535Ujhhgtgfeyxiexzf);
                C3645Ujhhgtgfeyxiexzf c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf = ConstraintLayout.m53Ujhhgtgfeyxiexzf();
                c2479feyxiexzfUjhhgtg2.m5304Ujhhgtgfeyxiexzf();
                c3649Ujhhgtgfeyxiexzf2.m5308Ujhhgtgfeyxiexzf(c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf);
                constraintLayout.addView(c2479feyxiexzfUjhhgtg2, c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf);
            }
            if (c3650Ujhhgtgfeyxiexzf2.f11482Ujhhgtgfeyxiexzf) {
                View c0546Ujhhgtgfeyxiexzf = new C0546Ujhhgtgfeyxiexzf(constraintLayout.getContext());
                c0546Ujhhgtgfeyxiexzf.setId(num.intValue());
                C3645Ujhhgtgfeyxiexzf c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf2 = ConstraintLayout.m53Ujhhgtgfeyxiexzf();
                c3649Ujhhgtgfeyxiexzf2.m5308Ujhhgtgfeyxiexzf(c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf2);
                constraintLayout.addView(c0546Ujhhgtgfeyxiexzf, c3645UjhhgtgfeyxiexzfM53Ujhhgtgfeyxiexzf2);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5317Ujhhgtgfeyxiexzf(ConstraintLayout constraintLayout) {
        C3654Ujhhgtgfeyxiexzf c3654Ujhhgtgfeyxiexzf = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c3654Ujhhgtgfeyxiexzf.f11569Ujhhgtgfeyxiexzf;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C3645Ujhhgtgfeyxiexzf c3645Ujhhgtgfeyxiexzf = (C3645Ujhhgtgfeyxiexzf) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c3654Ujhhgtgfeyxiexzf.f11568Ujhhgtgfeyxiexzf && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C3649Ujhhgtgfeyxiexzf());
            }
            C3649Ujhhgtgfeyxiexzf c3649Ujhhgtgfeyxiexzf = (C3649Ujhhgtgfeyxiexzf) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c3654Ujhhgtgfeyxiexzf.f11567Ujhhgtgfeyxiexzf;
            for (String str : map3.keySet()) {
                C3642Ujhhgtgfeyxiexzf c3642Ujhhgtgfeyxiexzf = (C3642Ujhhgtgfeyxiexzf) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C3642Ujhhgtgfeyxiexzf(c3642Ujhhgtgfeyxiexzf, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C3642Ujhhgtgfeyxiexzf(c3642Ujhhgtgfeyxiexzf, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c3649Ujhhgtgfeyxiexzf.f11480Ujhhgtgfeyxiexzf = map2;
            C3652Ujhhgtgfeyxiexzf c3652Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11476Ujhhgtgfeyxiexzf;
            C3650Ujhhgtgfeyxiexzf c3650Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf;
            C3653Ujhhgtgfeyxiexzf c3653Ujhhgtgfeyxiexzf = c3649Ujhhgtgfeyxiexzf.f11479Ujhhgtgfeyxiexzf;
            c3649Ujhhgtgfeyxiexzf.f11475Ujhhgtgfeyxiexzf = id;
            c3650Ujhhgtgfeyxiexzf.f11488Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11399Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11489Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11400Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11490Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11401Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11491Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11402Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11492Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11403Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11493Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11404Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11494Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11405Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11495Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11406Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11496Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11407Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11497Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11411Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11498Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11412Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11499Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11413Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11500Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11414Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11501Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11421feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11502Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11422feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11503Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11423feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11504Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11408Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11505Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11409Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11506feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11410Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11507feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11437feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11508feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11438feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11509feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11439feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11487Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11398Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11485Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11396Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11486Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11397Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11483Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).width;
            c3650Ujhhgtgfeyxiexzf.f11484Ujhhgtgfeyxiexzf = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).height;
            c3650Ujhhgtgfeyxiexzf.f11510feyxiexzfUjhhgtg = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).leftMargin;
            c3650Ujhhgtgfeyxiexzf.f11511feyxiexzfUjhhgtg = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).rightMargin;
            c3650Ujhhgtgfeyxiexzf.f11512feyxiexzfUjhhgtg = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).topMargin;
            c3650Ujhhgtgfeyxiexzf.f11513feyxiexzfUjhhgtg = ((ViewGroup.MarginLayoutParams) c3645Ujhhgtgfeyxiexzf).bottomMargin;
            c3650Ujhhgtgfeyxiexzf.f11522feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11426feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11523feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11425feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11525feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11428feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11524feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11427feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11540feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11440feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11541feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11441feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11526feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11429feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11527feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11430feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11528feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11433feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11529feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11434feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11530Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11431feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11531Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11432feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11532Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11435feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11533Ujhhgtgfeyxiexzf = c3645Ujhhgtgfeyxiexzf.f11436feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11539feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11442feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11517feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11416Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11519feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11418Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11516feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11415Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11518feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11417Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11521feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11419Ujhhgtgfeyxiexzf;
            c3650Ujhhgtgfeyxiexzf.f11520feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.f11420feyxiexzfUjhhgtg;
            c3650Ujhhgtgfeyxiexzf.f11514feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.getMarginEnd();
            c3650Ujhhgtgfeyxiexzf.f11515feyxiexzfUjhhgtg = c3645Ujhhgtgfeyxiexzf.getMarginStart();
            c3652Ujhhgtgfeyxiexzf.f11548Ujhhgtgfeyxiexzf = childAt.getVisibility();
            c3652Ujhhgtgfeyxiexzf.f11550Ujhhgtgfeyxiexzf = childAt.getAlpha();
            c3653Ujhhgtgfeyxiexzf.f11553Ujhhgtgfeyxiexzf = childAt.getRotation();
            c3653Ujhhgtgfeyxiexzf.f11554Ujhhgtgfeyxiexzf = childAt.getRotationX();
            c3653Ujhhgtgfeyxiexzf.f11555Ujhhgtgfeyxiexzf = childAt.getRotationY();
            c3653Ujhhgtgfeyxiexzf.f11556Ujhhgtgfeyxiexzf = childAt.getScaleX();
            c3653Ujhhgtgfeyxiexzf.f11557Ujhhgtgfeyxiexzf = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c3653Ujhhgtgfeyxiexzf.f11558Ujhhgtgfeyxiexzf = pivotX;
                c3653Ujhhgtgfeyxiexzf.f11559Ujhhgtgfeyxiexzf = pivotY;
            }
            c3653Ujhhgtgfeyxiexzf.f11560Ujhhgtgfeyxiexzf = childAt.getTranslationX();
            c3653Ujhhgtgfeyxiexzf.f11561Ujhhgtgfeyxiexzf = childAt.getTranslationY();
            c3653Ujhhgtgfeyxiexzf.f11562Ujhhgtgfeyxiexzf = childAt.getTranslationZ();
            if (c3653Ujhhgtgfeyxiexzf.f11563Ujhhgtgfeyxiexzf) {
                c3653Ujhhgtgfeyxiexzf.f11564Ujhhgtgfeyxiexzf = childAt.getElevation();
            }
            if (childAt instanceof C2479feyxiexzfUjhhgtg) {
                C2479feyxiexzfUjhhgtg c2479feyxiexzfUjhhgtg = (C2479feyxiexzfUjhhgtg) childAt;
                c3650Ujhhgtgfeyxiexzf.f11542Ujhhgtgfeyxiexzf = c2479feyxiexzfUjhhgtg.f8106Ujhhgtgfeyxiexzf.f8108feyxiexzfUjhhgtg;
                c3650Ujhhgtgfeyxiexzf.f11537feyxiexzfUjhhgtg = c2479feyxiexzfUjhhgtg.getReferencedIds();
                c3650Ujhhgtgfeyxiexzf.f11534Ujhhgtgfeyxiexzf = c2479feyxiexzfUjhhgtg.getType();
                c3650Ujhhgtgfeyxiexzf.f11535Ujhhgtgfeyxiexzf = c2479feyxiexzfUjhhgtg.getMargin();
            }
            i++;
            c3654Ujhhgtgfeyxiexzf = this;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m5318Ujhhgtgfeyxiexzf(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C3649Ujhhgtgfeyxiexzf c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf = m5314Ujhhgtgfeyxiexzf(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11478Ujhhgtgfeyxiexzf.f11482Ujhhgtgfeyxiexzf = true;
                    }
                    this.f11569Ujhhgtgfeyxiexzf.put(Integer.valueOf(c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf.f11475Ujhhgtgfeyxiexzf), c3649UjhhgtgfeyxiexzfM5314Ujhhgtgfeyxiexzf);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
