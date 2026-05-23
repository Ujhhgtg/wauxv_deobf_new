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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0792 {

    public static final int[] f3068 = {0, 4, 8};

    public static final SparseIntArray f3069;

    public final HashMap f3070 = new HashMap();

    public final boolean f3071 = true;

    public final HashMap f3072 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3069 = sparseIntArray;
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
        sparseIntArray.append(108, 67);
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
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    public static int[] m2299(C0366 c0366, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0366.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC2460.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0366.isInEditMode() && (c0366.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0366.getParent();
                if (true) {
                    HashMap map = constraintLayout.f209;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f209.get(strTrim);
                    }
                } else {
                    
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

    public static C0787 m2300(Context context, AttributeSet attributeSet) {
        C0787 c0787 = new C0787();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2461.f7809);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C0789 c0789 = c0787.f2980;
            C0791 c0791 = c0787.f2982;
            C0788 c0788 = c0787.f2981;
            if (index != 1 && 23 != index && 24 != index) {
                
                
                
            }
            SparseIntArray sparseIntArray = f3069;
            int i2 = sparseIntArray.get(index);
            C0790 c0790 = c0787.f2979;
            switch (i2) {
                case 1:
                    c0788.f2999 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2999);
                    break;
                case 2:
                    c0788.f3016 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3016);
                    break;
                case 3:
                    c0788.f2998 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2998);
                    break;
                case 4:
                    c0788.f2997 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2997);
                    break;
                case 5:
                    c0788.f3006 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c0788.f3010 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0788.f3010);
                    break;
                case 7:
                    c0788.f3011 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0788.f3011);
                    break;
                case 8:
                    c0788.f3017 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3017);
                    break;
                case 9:
                    c0788.f3003 = m2301(typedArrayObtainStyledAttributes, index, c0788.f3003);
                    break;
                case 10:
                    c0788.f3002 = m2301(typedArrayObtainStyledAttributes, index, c0788.f3002);
                    break;
                case 11:
                    c0788.f3022 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3022);
                    break;
                case 12 /* 12 */:
                    c0788.f3023 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3023);
                    break;
                case 13:
                    c0788.f3019 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3019);
                    break;
                case 14 /* 14 */:
                    c0788.f3021 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3021);
                    break;
                case 15:
                    c0788.f3024 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3024);
                    break;
                case 16:
                    c0788.f3020 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3020);
                    break;
                case 17 /* 17 */:
                    c0788.f2988 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0788.f2988);
                    break;
                case 18 /* 18 */:
                    c0788.f2989 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0788.f2989);
                    break;
                case 19:
                    c0788.f2990 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f2990);
                    break;
                case 20:
                    c0788.f3004 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3004);
                    break;
                case 21 /* 21 */:
                    c0788.f2987 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0788.f2987);
                    break;
                case 22 /* 22 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c0790.f3051);
                    c0790.f3051 = i3;
                    c0790.f3051 = f3068[i3];
                    break;
                case 23 /* 23 */:
                    c0788.f2986 = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0788.f2986);
                    break;
                case 24 /* 24 */:
                    c0788.f3013 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3013);
                    break;
                case 25 /* 25 */:
                    c0788.f2991 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2991);
                    break;
                case 26:
                    c0788.f2992 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2992);
                    break;
                case 27:
                    c0788.f3012 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3012);
                    break;
                case 28:
                    c0788.f3014 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3014);
                    break;
                case 29:
                    c0788.f2993 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2993);
                    break;
                case 30:
                    c0788.f2994 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2994);
                    break;
                case 31:
                    c0788.f3018 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3018);
                    break;
                case 32:
                    c0788.f3000 = m2301(typedArrayObtainStyledAttributes, index, c0788.f3000);
                    break;
                case 33:
                    c0788.f3001 = m2301(typedArrayObtainStyledAttributes, index, c0788.f3001);
                    break;
                case 34:
                    c0788.f3015 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3015);
                    break;
                case 35:
                    c0788.f2996 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2996);
                    break;
                case 36:
                    c0788.f2995 = m2301(typedArrayObtainStyledAttributes, index, c0788.f2995);
                    break;
                case 37:
                    c0788.f3005 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3005);
                    break;
                case 38:
                    c0787.f2978 = typedArrayObtainStyledAttributes.getResourceId(index, c0787.f2978);
                    break;
                case 39:
                    c0788.f3026 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3026);
                    break;
                case 40:
                    c0788.f3025 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3025);
                    break;
                case 41:
                    c0788.f3027 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3027);
                    break;
                case 42:
                    c0788.f3028 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3028);
                    break;
                case 43:
                    c0790.f3053 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3053);
                    break;
                case 44:
                    c0791.f3066 = true;
                    c0791.f3067 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3067);
                    break;
                case 45:
                    c0791.f3057 = typedArrayObtainStyledAttributes.getFloat(index, c0791.f3057);
                    break;
                case 46 /* 46 */:
                    c0791.f3058 = typedArrayObtainStyledAttributes.getFloat(index, c0791.f3058);
                    break;
                case 47:
                    c0791.f3059 = typedArrayObtainStyledAttributes.getFloat(index, c0791.f3059);
                    break;
                case 48:
                    c0791.f3060 = typedArrayObtainStyledAttributes.getFloat(index, c0791.f3060);
                    break;
                case 49:
                    c0791.f3061 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3061);
                    break;
                case 50 /* 50 */:
                    c0791.f3062 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3062);
                    break;
                case 51 /* 51 */:
                    c0791.f3063 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3063);
                    break;
                case 52:
                    c0791.f3064 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3064);
                    break;
                case 53 /* 53 */:
                    c0791.f3065 = typedArrayObtainStyledAttributes.getDimension(index, c0791.f3065);
                    break;
                case 54 /* 54 */:
                    c0788.f3029 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3029);
                    break;
                case 55 /* 55 */:
                    c0788.f3030 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3030);
                    break;
                case 56 /* 56 */:
                    c0788.f3031 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3031);
                    break;
                case 57 /* 57 */:
                    c0788.f3032 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3032);
                    break;
                case 58 /* 58 */:
                    c0788.f3033 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3033);
                    break;
                case 59:
                    c0788.f3034 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3034);
                    break;
                case 60:
                    c0791.f3056 = typedArrayObtainStyledAttributes.getFloat(index, c0791.f3056);
                    break;
                case 61:
                    c0788.f3007 = m2301(typedArrayObtainStyledAttributes, index, c0788.f3007);
                    break;
                case 62:
                    c0788.f3008 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3008);
                    break;
                case 63:
                    c0788.f3009 = typedArrayObtainStyledAttributes.getFloat(index, c0788.f3009);
                    break;
                case 64:
                    c0789.f3047 = m2301(typedArrayObtainStyledAttributes, index, c0789.f3047);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        
                    } else {
                        String str = AbstractC2207.f7175[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    
                    break;
                case 67:
                    c0789.f3050 = typedArrayObtainStyledAttributes.getFloat(index, c0789.f3050);
                    break;
                case 68:
                    c0790.f3054 = typedArrayObtainStyledAttributes.getFloat(index, c0790.f3054);
                    break;
                case 69:
                    c0788.f3035 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0788.f3036 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0788.f3037 = typedArrayObtainStyledAttributes.getInt(index, c0788.f3037);
                    break;
                case 73:
                    c0788.f3038 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0788.f3038);
                    break;
                case 74:
                    c0788.f3041 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c0788.f3045 = typedArrayObtainStyledAttributes.getBoolean(index, c0788.f3045);
                    break;
                case 76:
                    c0789.f3048 = typedArrayObtainStyledAttributes.getInt(index, c0789.f3048);
                    break;
                case 77:
                    c0788.f3042 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c0790.f3052 = typedArrayObtainStyledAttributes.getInt(index, c0790.f3052);
                    break;
                case 79 /* 79 */:
                    c0789.f3049 = typedArrayObtainStyledAttributes.getFloat(index, c0789.f3049);
                    break;
                case 80:
                    c0788.f3043 = typedArrayObtainStyledAttributes.getBoolean(index, c0788.f3043);
                    break;
                case 81:
                    c0788.f3044 = typedArrayObtainStyledAttributes.getBoolean(index, c0788.f3044);
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
        return c0787;
    }

    public static int m2301(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void m2302(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        String resourceEntryName;
        C0792 c0792 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0792.f3072;
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
                if (c0792.f3071 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C0787 c0787 = (C0787) map.get(Integer.valueOf(id));
                        if (childAt instanceof C0366) {
                            c0787.f2981.f3039 = 1;
                        }
                        C0788 c0788 = c0787.f2981;
                        C0790 c0790 = c0787.f2979;
                        C0791 c0791 = c0787.f2982;
                        int i5 = c0788.f3039;
                        if (i5 != -1 && i5 == 1) {
                            C0366 c0366 = (C0366) childAt;
                            c0366.setId(id);
                            c0366.setType(c0788.f3037);
                            c0366.setMargin(c0788.f3038);
                            c0366.setAllowsGoneWidget(c0788.f3045);
                            int[] iArr = c0788.f3040;
                            if (iArr != null) {
                                c0366.setReferencedIds(iArr);
                            } else {
                                String str = c0788.f3041;
                                if (str != null) {
                                    int[] iArrM2299 = m2299(c0366, str);
                                    c0788.f3040 = iArrM2299;
                                    c0366.setReferencedIds(iArrM2299);
                                }
                            }
                        }
                        C0783 c0783 = (C0783) childAt.getLayoutParams();
                        c0783.m2291();
                        c0787.m2294(c0783);
                        HashMap map2 = c0787.f2983;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C0780 c0780 = (C0780) map2.get(str2);
                            int i6 = childCount;
                            String strM4757 = AbstractC2784.m4757("set", str2);
                            HashSet hashSet3 = hashSet2;
                            try {
                                int iM4759 = AbstractC2784.m4759(c0780.f2885);
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iM4759) {
                                    case 0:
                                        i3 = i4;
                                        cls.getMethod(strM4757, cls2).invoke(childAt, Integer.valueOf(c0780.f2886));
                                        break;
                                    case 1:
                                        i3 = i4;
                                        cls.getMethod(strM4757, cls3).invoke(childAt, Float.valueOf(c0780.f2887));
                                        break;
                                    case 2:
                                        i3 = i4;
                                        cls.getMethod(strM4757, cls2).invoke(childAt, Integer.valueOf(c0780.f2890));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM4757, Drawable.class);
                                        i3 = i4;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0780.f2890);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            StringBuilder sbM4679 = AbstractC2668.m4679(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM4679.append(cls.getName());
                                            Log.e("TransitionLayout", sbM4679.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM4757);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            StringBuilder sbM46710 = AbstractC2668.m4679(" Custom Attribute \"", str2, "\" not found on ");
                                            sbM46710.append(cls.getName());
                                            Log.e("TransitionLayout", sbM46710.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM4757, CharSequence.class).invoke(childAt, c0780.f2888);
                                        i3 = i4;
                                        break;
                                    case 5:
                                        cls.getMethod(strM4757, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0780.f2889));
                                        i3 = i4;
                                        break;
                                    case 6:
                                        cls.getMethod(strM4757, cls3).invoke(childAt, Float.valueOf(c0780.f2887));
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
                        childAt.setLayoutParams(c0783);
                        if (c0790.f3052 == 0) {
                            childAt.setVisibility(c0790.f3051);
                        }
                        childAt.setAlpha(c0790.f3053);
                        childAt.setRotation(c0791.f3056);
                        childAt.setRotationX(c0791.f3057);
                        childAt.setRotationY(c0791.f3058);
                        childAt.setScaleX(c0791.f3059);
                        childAt.setScaleY(c0791.f3060);
                        if (!Float.isNaN(c0791.f3061)) {
                            childAt.setPivotX(c0791.f3061);
                        }
                        if (!Float.isNaN(c0791.f3062)) {
                            childAt.setPivotY(c0791.f3062);
                        }
                        childAt.setTranslationX(c0791.f3063);
                        childAt.setTranslationY(c0791.f3064);
                        childAt.setTranslationZ(c0791.f3065);
                        if (c0791.f3066) {
                            childAt.setElevation(c0791.f3067);
                        }
                    } else {
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                c0792 = this;
                childCount = i;
                hashSet2 = hashSet;
            }
            i = childCount;
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            c0792 = this;
            childCount = i;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C0787 c0789 = (C0787) map.get(num);
            C0788 c07810 = c0789.f2981;
            int i7 = c07810.f3039;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout.getContext();
                C0366 c0367 = new C0366(context);
                c0367.f2891 = new int[32];
                c0367.f2897 = new HashMap();
                c0367.f2893 = context;
                C0367 c0368 = new C0367();
                c0368.f1743 = 0;
                c0368.f1744 = true;
                c0368.f1745 = 0;
                c0368.f1746 = false;
                c0367.f1742 = c0368;
                c0367.f2894 = c0368;
                c0367.m2290();
                c0367.setVisibility(8);
                c0367.setId(num.intValue());
                int[] iArr2 = c07810.f3040;
                if (iArr2 != null) {
                    c0367.setReferencedIds(iArr2);
                } else {
                    String str3 = c07810.f3041;
                    if (str3 != null) {
                        int[] iArrM22910 = m2299(c0367, str3);
                        c07810.f3040 = iArrM22910;
                        c0367.setReferencedIds(iArrM22910);
                    }
                }
                c0367.setType(c07810.f3037);
                c0367.setMargin(c07810.f3038);
                C0783 c0783M53 = ConstraintLayout.m53();
                c0367.m2290();
                c0789.m2294(c0783M53);
                constraintLayout.addView(c0367, c0783M53);
            }
            if (c07810.f2985) {
                View c1505 = new C1505(constraintLayout.getContext());
                c1505.setId(num.intValue());
                C0783 c0783M54 = ConstraintLayout.m53();
                c0789.m2294(c0783M54);
                constraintLayout.addView(c1505, c0783M54);
            }
        }
    }

    public final void m2303(ConstraintLayout constraintLayout) {
        C0792 c0792 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0792.f3072;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0783 c0783 = (C0783) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0792.f3071 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0787());
            }
            C0787 c0787 = (C0787) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c0792.f3070;
            for (String str : map3.keySet()) {
                C0780 c0780 = (C0780) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put("BackgroundColor", new C0780(c0780, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C0780(c0780, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c0787.f2983 = map2;
            C0790 c0790 = c0787.f2979;
            C0788 c0788 = c0787.f2981;
            C0791 c0791 = c0787.f2982;
            c0787.f2978 = id;
            c0788.f2991 = c0783.f2902;
            c0788.f2992 = c0783.f2903;
            c0788.f2993 = c0783.f2904;
            c0788.f2994 = c0783.f2905;
            c0788.f2995 = c0783.f2906;
            c0788.f2996 = c0783.f2907;
            c0788.f2997 = c0783.f2908;
            c0788.f2998 = c0783.f2909;
            c0788.f2999 = c0783.f2910;
            c0788.f3000 = c0783.f2914;
            c0788.f3001 = c0783.f2915;
            c0788.f3002 = c0783.f2916;
            c0788.f3003 = c0783.f2917;
            c0788.f3004 = c0783.f2924;
            c0788.f3005 = c0783.f2925;
            c0788.f3006 = c0783.f2926;
            c0788.f3007 = c0783.f2911;
            c0788.f3008 = c0783.f2912;
            c0788.f3009 = c0783.f2913;
            c0788.f3010 = c0783.f2940;
            c0788.f3011 = c0783.f2941;
            c0788.f3012 = c0783.f2942;
            c0788.f2990 = c0783.f2901;
            c0788.f2988 = c0783.f2899;
            c0788.f2989 = c0783.f2900;
            c0788.f2986 = ((ViewGroup.MarginLayoutParams) c0783).width;
            c0788.f2987 = ((ViewGroup.MarginLayoutParams) c0783).height;
            c0788.f3013 = ((ViewGroup.MarginLayoutParams) c0783).leftMargin;
            c0788.f3014 = ((ViewGroup.MarginLayoutParams) c0783).rightMargin;
            c0788.f3015 = ((ViewGroup.MarginLayoutParams) c0783).topMargin;
            c0788.f3016 = ((ViewGroup.MarginLayoutParams) c0783).bottomMargin;
            c0788.f3025 = c0783.f2929;
            c0788.f3026 = c0783.f2928;
            c0788.f3028 = c0783.f2931;
            c0788.f3027 = c0783.f2930;
            c0788.f3043 = c0783.f2943;
            c0788.f3044 = c0783.f2944;
            c0788.f3029 = c0783.f2932;
            c0788.f3030 = c0783.f2933;
            c0788.f3031 = c0783.f2936;
            c0788.f3032 = c0783.f2937;
            c0788.f3033 = c0783.f2934;
            c0788.f3034 = c0783.f2935;
            c0788.f3035 = c0783.f2938;
            c0788.f3036 = c0783.f2939;
            c0788.f3042 = c0783.f2945;
            c0788.f3020 = c0783.f2919;
            c0788.f3022 = c0783.f2921;
            c0788.f3019 = c0783.f2918;
            c0788.f3021 = c0783.f2920;
            c0788.f3024 = c0783.f2922;
            c0788.f3023 = c0783.f2923;
            c0788.f3017 = c0783.getMarginEnd();
            c0788.f3018 = c0783.getMarginStart();
            c0790.f3051 = childAt.getVisibility();
            c0790.f3053 = childAt.getAlpha();
            c0791.f3056 = childAt.getRotation();
            c0791.f3057 = childAt.getRotationX();
            c0791.f3058 = childAt.getRotationY();
            c0791.f3059 = childAt.getScaleX();
            c0791.f3060 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c0791.f3061 = pivotX;
                c0791.f3062 = pivotY;
            }
            c0791.f3063 = childAt.getTranslationX();
            c0791.f3064 = childAt.getTranslationY();
            c0791.f3065 = childAt.getTranslationZ();
            if (c0791.f3066) {
                c0791.f3067 = childAt.getElevation();
            }
            if (childAt instanceof C0366) {
                C0366 c0366 = (C0366) childAt;
                c0788.f3045 = c0366.f1742.f1744;
                c0788.f3040 = c0366.getReferencedIds();
                c0788.f3037 = c0366.getType();
                c0788.f3038 = c0366.getMargin();
            }
            i++;
            c0792 = this;
        }
    }

    public final void m2304(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0787 c0787M2300 = m2300(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0787M2300.f2981.f2985 = true;
                    }
                    this.f3072.put(Integer.valueOf(c0787M2300.f2978), c0787M2300);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
