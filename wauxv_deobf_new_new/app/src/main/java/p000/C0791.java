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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲇᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0791 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final int[] f3075 = {0, 4, 8};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final SparseIntArray f3076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f3077 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean f3078 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f3079 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3076 = sparseIntArray;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int[] m2414(C0341 c0341, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0341.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC2512.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0341.isInEditMode() && (c0341.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0341.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f209;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f209.get(strTrim);
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C0786 m2415(Context context, AttributeSet attributeSet) {
        C0786 c0786 = new C0786();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2515.f7955);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C0788 c0788 = c0786.f2987;
            C0790 c0790 = c0786.f2989;
            C0787 c0787 = c0786.f2988;
            if (index != 1 && 23 != index && 24 != index) {
                c0788.getClass();
                c0787.getClass();
                c0790.getClass();
            }
            SparseIntArray sparseIntArray = f3076;
            int i2 = sparseIntArray.get(index);
            C0789 c0789 = c0786.f2986;
            switch (i2) {
                case 1:
                    c0787.f3006 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3006);
                    break;
                case 2:
                    c0787.f3023 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3023);
                    break;
                case 3:
                    c0787.f3005 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3005);
                    break;
                case 4:
                    c0787.f3004 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3004);
                    break;
                case 5:
                    c0787.f3013 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c0787.f3017 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0787.f3017);
                    break;
                case 7:
                    c0787.f3018 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0787.f3018);
                    break;
                case 8:
                    c0787.f3024 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3024);
                    break;
                case 9:
                    c0787.f3010 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3010);
                    break;
                case 10:
                    c0787.f3009 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3009);
                    break;
                case 11:
                    c0787.f3029 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3029);
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    c0787.f3030 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3030);
                    break;
                case 13:
                    c0787.f3026 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3026);
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    c0787.f3028 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3028);
                    break;
                case 15:
                    c0787.f3031 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3031);
                    break;
                case 16:
                    c0787.f3027 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3027);
                    break;
                case Opcodes.SIPUSH /* 17 */:
                    c0787.f2995 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0787.f2995);
                    break;
                case Opcodes.LDC /* 18 */:
                    c0787.f2996 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0787.f2996);
                    break;
                case 19:
                    c0787.f2997 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f2997);
                    break;
                case 20:
                    c0787.f3011 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f3011);
                    break;
                case Opcodes.ILOAD /* 21 */:
                    c0787.f2994 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0787.f2994);
                    break;
                case Opcodes.LLOAD /* 22 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c0789.f3058);
                    c0789.f3058 = i3;
                    c0789.f3058 = f3075[i3];
                    break;
                case Opcodes.FLOAD /* 23 */:
                    c0787.f2993 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0787.f2993);
                    break;
                case Opcodes.DLOAD /* 24 */:
                    c0787.f3020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3020);
                    break;
                case Opcodes.ALOAD /* 25 */:
                    c0787.f2998 = m2416(typedArrayObtainStyledAttributes, index, c0787.f2998);
                    break;
                case 26:
                    c0787.f2999 = m2416(typedArrayObtainStyledAttributes, index, c0787.f2999);
                    break;
                case 27:
                    c0787.f3019 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3019);
                    break;
                case 28:
                    c0787.f3021 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3021);
                    break;
                case 29:
                    c0787.f3000 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3000);
                    break;
                case 30:
                    c0787.f3001 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3001);
                    break;
                case 31:
                    c0787.f3025 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3025);
                    break;
                case 32:
                    c0787.f3007 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3007);
                    break;
                case 33:
                    c0787.f3008 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3008);
                    break;
                case 34:
                    c0787.f3022 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3022);
                    break;
                case 35:
                    c0787.f3003 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3003);
                    break;
                case 36:
                    c0787.f3002 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3002);
                    break;
                case 37:
                    c0787.f3012 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f3012);
                    break;
                case 38:
                    c0786.f2985 = typedArrayObtainStyledAttributes.getResourceId(index, c0786.f2985);
                    break;
                case 39:
                    c0787.f3033 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f3033);
                    break;
                case 40:
                    c0787.f3032 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f3032);
                    break;
                case 41:
                    c0787.f3034 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3034);
                    break;
                case 42:
                    c0787.f3035 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3035);
                    break;
                case 43:
                    c0789.f3060 = typedArrayObtainStyledAttributes.getFloat(index, c0789.f3060);
                    break;
                case 44:
                    c0790.f3073 = true;
                    c0790.f3074 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3074);
                    break;
                case 45:
                    c0790.f3064 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3064);
                    break;
                case Opcodes.IALOAD /* 46 */:
                    c0790.f3065 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3065);
                    break;
                case 47:
                    c0790.f3066 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3066);
                    break;
                case 48:
                    c0790.f3067 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3067);
                    break;
                case 49:
                    c0790.f3068 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3068);
                    break;
                case Opcodes.AALOAD /* 50 */:
                    c0790.f3069 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3069);
                    break;
                case Opcodes.BALOAD /* 51 */:
                    c0790.f3070 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3070);
                    break;
                case 52:
                    c0790.f3071 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3071);
                    break;
                case Opcodes.SALOAD /* 53 */:
                    c0790.f3072 = typedArrayObtainStyledAttributes.getDimension(index, c0790.f3072);
                    break;
                case Opcodes.ISTORE /* 54 */:
                    c0787.f3036 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3036);
                    break;
                case Opcodes.LSTORE /* 55 */:
                    c0787.f3037 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3037);
                    break;
                case Opcodes.FSTORE /* 56 */:
                    c0787.f3038 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3038);
                    break;
                case Opcodes.DSTORE /* 57 */:
                    c0787.f3039 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3039);
                    break;
                case Opcodes.ASTORE /* 58 */:
                    c0787.f3040 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3040);
                    break;
                case 59:
                    c0787.f3041 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3041);
                    break;
                case 60:
                    c0790.f3063 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3063);
                    break;
                case 61:
                    c0787.f3014 = m2416(typedArrayObtainStyledAttributes, index, c0787.f3014);
                    break;
                case 62:
                    c0787.f3015 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3015);
                    break;
                case 63:
                    c0787.f3016 = typedArrayObtainStyledAttributes.getFloat(index, c0787.f3016);
                    break;
                case 64:
                    c0788.f3054 = m2416(typedArrayObtainStyledAttributes, index, c0788.f3054);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c0788.getClass();
                    } else {
                        String str = AbstractC2727.f8747[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c0788.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0788.getClass();
                    break;
                case 67:
                    c0788.f3057 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3057);
                    break;
                case 68:
                    c0789.f3061 = typedArrayObtainStyledAttributes.getFloat(index, c0789.f3061);
                    break;
                case 69:
                    c0787.f3042 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0787.f3043 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0787.f3044 = typedArrayObtainStyledAttributes.getInt(index, c0787.f3044);
                    break;
                case 73:
                    c0787.f3045 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0787.f3045);
                    break;
                case 74:
                    c0787.f3048 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c0787.f3052 = typedArrayObtainStyledAttributes.getBoolean(index, c0787.f3052);
                    break;
                case 76:
                    c0788.f3055 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3055);
                    break;
                case 77:
                    c0787.f3049 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c0789.f3059 = typedArrayObtainStyledAttributes.getInt(index, c0789.f3059);
                    break;
                case Opcodes.IASTORE /* 79 */:
                    c0788.f3056 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3056);
                    break;
                case 80:
                    c0787.f3050 = typedArrayObtainStyledAttributes.getBoolean(index, c0787.f3050);
                    break;
                case 81:
                    c0787.f3051 = typedArrayObtainStyledAttributes.getBoolean(index, c0787.f3051);
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
        return c0786;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static int m2416(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2417(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        String resourceEntryName;
        C0791 c0791 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0791.f3079;
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
                if (c0791.f3078 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C0786 c0786 = (C0786) map.get(Integer.valueOf(id));
                        if (childAt instanceof C0341) {
                            c0786.f2988.f3046 = 1;
                        }
                        C0787 c0787 = c0786.f2988;
                        C0789 c0789 = c0786.f2986;
                        C0790 c0790 = c0786.f2989;
                        int i5 = c0787.f3046;
                        if (i5 != -1 && i5 == 1) {
                            C0341 c0341 = (C0341) childAt;
                            c0341.setId(id);
                            c0341.setType(c0787.f3044);
                            c0341.setMargin(c0787.f3045);
                            c0341.setAllowsGoneWidget(c0787.f3052);
                            int[] iArr = c0787.f3047;
                            if (iArr != null) {
                                c0341.setReferencedIds(iArr);
                            } else {
                                String str = c0787.f3048;
                                if (str != null) {
                                    int[] iArrM2414 = m2414(c0341, str);
                                    c0787.f3047 = iArrM2414;
                                    c0341.setReferencedIds(iArrM2414);
                                }
                            }
                        }
                        C0782 c0782 = (C0782) childAt.getLayoutParams();
                        c0782.m2406();
                        c0786.m2409(c0782);
                        HashMap map2 = c0786.f2990;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C0779 c0779 = (C0779) map2.get(str2);
                            int i6 = childCount;
                            String strM4790 = AbstractC2844.m4790("set", str2);
                            HashSet hashSet3 = hashSet2;
                            try {
                                int iM4792 = AbstractC2844.m4792(c0779.f2892);
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iM4792) {
                                    case 0:
                                        i3 = i4;
                                        cls.getMethod(strM4790, cls2).invoke(childAt, Integer.valueOf(c0779.f2893));
                                        break;
                                    case 1:
                                        i3 = i4;
                                        cls.getMethod(strM4790, cls3).invoke(childAt, Float.valueOf(c0779.f2894));
                                        break;
                                    case 2:
                                        i3 = i4;
                                        cls.getMethod(strM4790, cls2).invoke(childAt, Integer.valueOf(c0779.f2897));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM4790, Drawable.class);
                                        i3 = i4;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0779.f2897);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            StringBuilder sbM4625 = AbstractC2647.m4625(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM4625.append(cls.getName());
                                            Log.e("TransitionLayout", sbM4625.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM4790);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            StringBuilder sbM4626 = AbstractC2647.m4625(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM4626.append(cls.getName());
                                            Log.e("TransitionLayout", sbM4626.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM4790, CharSequence.class).invoke(childAt, c0779.f2895);
                                        i3 = i4;
                                        break;
                                    case 5:
                                        cls.getMethod(strM4790, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0779.f2896));
                                        i3 = i4;
                                        break;
                                    case 6:
                                        cls.getMethod(strM4790, cls3).invoke(childAt, Float.valueOf(c0779.f2894));
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
                        childAt.setLayoutParams(c0782);
                        if (c0789.f3059 == 0) {
                            childAt.setVisibility(c0789.f3058);
                        }
                        childAt.setAlpha(c0789.f3060);
                        childAt.setRotation(c0790.f3063);
                        childAt.setRotationX(c0790.f3064);
                        childAt.setRotationY(c0790.f3065);
                        childAt.setScaleX(c0790.f3066);
                        childAt.setScaleY(c0790.f3067);
                        if (!Float.isNaN(c0790.f3068)) {
                            childAt.setPivotX(c0790.f3068);
                        }
                        if (!Float.isNaN(c0790.f3069)) {
                            childAt.setPivotY(c0790.f3069);
                        }
                        childAt.setTranslationX(c0790.f3070);
                        childAt.setTranslationY(c0790.f3071);
                        childAt.setTranslationZ(c0790.f3072);
                        if (c0790.f3073) {
                            childAt.setElevation(c0790.f3074);
                        }
                    } else {
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                c0791 = this;
                childCount = i;
                hashSet2 = hashSet;
            }
            i = childCount;
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            c0791 = this;
            childCount = i;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C0786 c0788 = (C0786) map.get(num);
            C0787 c07810 = c0788.f2988;
            int i7 = c07810.f3046;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout.getContext();
                C0341 c0342 = new C0341(context);
                c0342.f2898 = new int[32];
                c0342.f2904 = new HashMap();
                c0342.f2900 = context;
                C0342 c0343 = new C0342();
                c0343.f1714 = 0;
                c0343.f1715 = true;
                c0343.f1716 = 0;
                c0343.f1717 = false;
                c0342.f1713 = c0343;
                c0342.f2901 = c0343;
                c0342.m2405();
                c0342.setVisibility(8);
                c0342.setId(num.intValue());
                int[] iArr2 = c07810.f3047;
                if (iArr2 != null) {
                    c0342.setReferencedIds(iArr2);
                } else {
                    String str3 = c07810.f3048;
                    if (str3 != null) {
                        int[] iArrM2415 = m2414(c0342, str3);
                        c07810.f3047 = iArrM2415;
                        c0342.setReferencedIds(iArrM2415);
                    }
                }
                c0342.setType(c07810.f3044);
                c0342.setMargin(c07810.f3045);
                C0782 c0782M53 = ConstraintLayout.m53();
                c0342.m2405();
                c0788.m2409(c0782M53);
                constraintLayout.addView(c0342, c0782M53);
            }
            if (c07810.f2992) {
                View c1517 = new C1517(constraintLayout.getContext());
                c1517.setId(num.intValue());
                C0782 c0782M54 = ConstraintLayout.m53();
                c0788.m2409(c0782M54);
                constraintLayout.addView(c1517, c0782M54);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2418(ConstraintLayout constraintLayout) {
        C0791 c0791 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0791.f3079;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0782 c0782 = (C0782) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0791.f3078 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0786());
            }
            C0786 c0786 = (C0786) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c0791.f3077;
            for (String str : map3.keySet()) {
                C0779 c0779 = (C0779) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C0779(c0779, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C0779(c0779, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c0786.f2990 = map2;
            C0789 c0789 = c0786.f2986;
            C0787 c0787 = c0786.f2988;
            C0790 c0790 = c0786.f2989;
            c0786.f2985 = id;
            c0787.f2998 = c0782.f2909;
            c0787.f2999 = c0782.f2910;
            c0787.f3000 = c0782.f2911;
            c0787.f3001 = c0782.f2912;
            c0787.f3002 = c0782.f2913;
            c0787.f3003 = c0782.f2914;
            c0787.f3004 = c0782.f2915;
            c0787.f3005 = c0782.f2916;
            c0787.f3006 = c0782.f2917;
            c0787.f3007 = c0782.f2921;
            c0787.f3008 = c0782.f2922;
            c0787.f3009 = c0782.f2923;
            c0787.f3010 = c0782.f2924;
            c0787.f3011 = c0782.f2931;
            c0787.f3012 = c0782.f2932;
            c0787.f3013 = c0782.f2933;
            c0787.f3014 = c0782.f2918;
            c0787.f3015 = c0782.f2919;
            c0787.f3016 = c0782.f2920;
            c0787.f3017 = c0782.f2947;
            c0787.f3018 = c0782.f2948;
            c0787.f3019 = c0782.f2949;
            c0787.f2997 = c0782.f2908;
            c0787.f2995 = c0782.f2906;
            c0787.f2996 = c0782.f2907;
            c0787.f2993 = ((ViewGroup.MarginLayoutParams) c0782).width;
            c0787.f2994 = ((ViewGroup.MarginLayoutParams) c0782).height;
            c0787.f3020 = ((ViewGroup.MarginLayoutParams) c0782).leftMargin;
            c0787.f3021 = ((ViewGroup.MarginLayoutParams) c0782).rightMargin;
            c0787.f3022 = ((ViewGroup.MarginLayoutParams) c0782).topMargin;
            c0787.f3023 = ((ViewGroup.MarginLayoutParams) c0782).bottomMargin;
            c0787.f3032 = c0782.f2936;
            c0787.f3033 = c0782.f2935;
            c0787.f3035 = c0782.f2938;
            c0787.f3034 = c0782.f2937;
            c0787.f3050 = c0782.f2950;
            c0787.f3051 = c0782.f2951;
            c0787.f3036 = c0782.f2939;
            c0787.f3037 = c0782.f2940;
            c0787.f3038 = c0782.f2943;
            c0787.f3039 = c0782.f2944;
            c0787.f3040 = c0782.f2941;
            c0787.f3041 = c0782.f2942;
            c0787.f3042 = c0782.f2945;
            c0787.f3043 = c0782.f2946;
            c0787.f3049 = c0782.f2952;
            c0787.f3027 = c0782.f2926;
            c0787.f3029 = c0782.f2928;
            c0787.f3026 = c0782.f2925;
            c0787.f3028 = c0782.f2927;
            c0787.f3031 = c0782.f2929;
            c0787.f3030 = c0782.f2930;
            c0787.f3024 = c0782.getMarginEnd();
            c0787.f3025 = c0782.getMarginStart();
            c0789.f3058 = childAt.getVisibility();
            c0789.f3060 = childAt.getAlpha();
            c0790.f3063 = childAt.getRotation();
            c0790.f3064 = childAt.getRotationX();
            c0790.f3065 = childAt.getRotationY();
            c0790.f3066 = childAt.getScaleX();
            c0790.f3067 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c0790.f3068 = pivotX;
                c0790.f3069 = pivotY;
            }
            c0790.f3070 = childAt.getTranslationX();
            c0790.f3071 = childAt.getTranslationY();
            c0790.f3072 = childAt.getTranslationZ();
            if (c0790.f3073) {
                c0790.f3074 = childAt.getElevation();
            }
            if (childAt instanceof C0341) {
                C0341 c0341 = (C0341) childAt;
                c0787.f3052 = c0341.f1713.f1715;
                c0787.f3047 = c0341.getReferencedIds();
                c0787.f3044 = c0341.getType();
                c0787.f3045 = c0341.getMargin();
            }
            i++;
            c0791 = this;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2419(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0786 c0786M2415 = m2415(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0786M2415.f2988.f2992 = true;
                    }
                    this.f3079.put(Integer.valueOf(c0786M2415.f2985), c0786M2415);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
