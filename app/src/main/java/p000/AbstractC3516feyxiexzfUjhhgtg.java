package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.Primitive;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳ能不能ᛴᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3516feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static volatile ExecutorService f10961Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int[] f10962Ujhhgtgfeyxiexzf = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f10963Ujhhgtgfeyxiexzf = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int[] f10964Ujhhgtgfeyxiexzf = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final int[] f10965Ujhhgtgfeyxiexzf = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final int[] f10966Ujhhgtgfeyxiexzf = {R.attr.drawable};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final int[] f10967Ujhhgtgfeyxiexzf = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final C2466feyxiexzfUjhhgtg f10968Ujhhgtgfeyxiexzf = new C2466feyxiexzfUjhhgtg(18);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m5047Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf) {
        if ((interfaceC3329Ujhhgtgfeyxiexzf instanceof C1167feyxiexzfUjhhgtg ? (C1167feyxiexzfUjhhgtg) interfaceC3329Ujhhgtgfeyxiexzf : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(interfaceC3329Ujhhgtgfeyxiexzf.getClass()));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C1164feyxiexzfUjhhgtg m5048Ujhhgtgfeyxiexzf(InterfaceC3091Ujhhgtgfeyxiexzf interfaceC3091Ujhhgtgfeyxiexzf) {
        C1164feyxiexzfUjhhgtg c1164feyxiexzfUjhhgtg = interfaceC3091Ujhhgtgfeyxiexzf instanceof C1164feyxiexzfUjhhgtg ? (C1164feyxiexzfUjhhgtg) interfaceC3091Ujhhgtgfeyxiexzf : null;
        if (c1164feyxiexzfUjhhgtg != null) {
            return c1164feyxiexzfUjhhgtg;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(interfaceC3091Ujhhgtgfeyxiexzf.getClass()));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean m5049Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2, Rect rect3) {
        int iM5064Ujhhgtgfeyxiexzf;
        int i2;
        int i3;
        boolean zM5050Ujhhgtgfeyxiexzf = m5050Ujhhgtgfeyxiexzf(i, rect, rect2);
        if (m5050Ujhhgtgfeyxiexzf(i, rect, rect3) || !zM5050Ujhhgtgfeyxiexzf) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            iM5064Ujhhgtgfeyxiexzf = m5064Ujhhgtgfeyxiexzf(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iM5064Ujhhgtgfeyxiexzf < Math.max(1, i2 - i3)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iM5064Ujhhgtgfeyxiexzf = m5064Ujhhgtgfeyxiexzf(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iM5064Ujhhgtgfeyxiexzf < Math.max(1, i2 - i3)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iM5064Ujhhgtgfeyxiexzf = m5064Ujhhgtgfeyxiexzf(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iM5064Ujhhgtgfeyxiexzf < Math.max(1, i2 - i3)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iM5064Ujhhgtgfeyxiexzf = m5064Ujhhgtgfeyxiexzf(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                }
                if (iM5064Ujhhgtgfeyxiexzf < Math.max(1, i2 - i3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m5050Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C1103feyxiexzfUjhhgtg m5051Ujhhgtgfeyxiexzf(String str, AbstractC3611Ujhhgtgfeyxiexzf abstractC3611Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg[] interfaceC1121feyxiexzfUjhhgtgArr, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC3611Ujhhgtgfeyxiexzf.equals(C1189feyxiexzfUjhhgtg.f4474Ujhhgtgfeyxiexzf)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C2840feyxiexzfUjhhgtg c2840feyxiexzfUjhhgtg = new C2840feyxiexzfUjhhgtg(str);
        interfaceC3549feyxiexzfUjhhgtg.invoke(c2840feyxiexzfUjhhgtg);
        return new C1103feyxiexzfUjhhgtg(str, abstractC3611Ujhhgtgfeyxiexzf, c2840feyxiexzfUjhhgtg.f9021Ujhhgtgfeyxiexzf.size(), AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtgArr), c2840feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m5052Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "startIndex: ", " > endIndex: ", i2));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m5053Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "fromIndex: ", " > toIndex: ", i2));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static void m5054Ujhhgtgfeyxiexzf(Class cls, Object obj, Object... objArr) {
        int i;
        int i2;
        int length = Array.getLength(objArr[0]);
        int length2 = objArr.length > 1 ? Array.getLength(obj) : length;
        if (AbstractC0034Ujhhgtgfeyxiexzf.m555Ujhhgtgfeyxiexzf(obj.getClass()) != 1) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length2) {
                if (length < length2 && i4 == length && (i = i5 + 1) < objArr.length) {
                    length = Array.getLength(objArr[i]);
                    i4 = 0;
                    i5 = i;
                }
                int i6 = i4 + 1;
                Object obj2 = Array.get(objArr[i5], i4);
                if (obj2 == null) {
                    Array.set(obj, i3, null);
                } else {
                    Object objNewInstance = Array.get(obj, i3);
                    if (Array.getLength(obj2) != Array.getLength(objNewInstance)) {
                        objNewInstance = Array.newInstance((Class<?>) cls, m5056Ujhhgtgfeyxiexzf(obj2));
                        Array.set(obj, i3, objNewInstance);
                    }
                    m5054Ujhhgtgfeyxiexzf(cls, objNewInstance, obj2);
                }
                i3++;
                i4 = i6;
            }
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = i8 + 1;
            Object objUnwrap = Array.get(objArr[i7], i8);
            try {
                objUnwrap = Primitive.unwrap(AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, cls, objUnwrap));
            } catch (C1863Ujhhgtgfeyxiexzf unused) {
            }
            if (Byte.TYPE == cls) {
                Array.setByte(obj, i9, ((Byte) objUnwrap).byteValue());
            } else if (Short.TYPE == cls) {
                Array.setShort(obj, i9, ((Short) objUnwrap).shortValue());
            } else if (Integer.TYPE == cls) {
                Array.setInt(obj, i9, ((Integer) objUnwrap).intValue());
            } else if (Long.TYPE == cls) {
                Array.setLong(obj, i9, ((Long) objUnwrap).longValue());
            } else if (Float.TYPE == cls) {
                Array.setFloat(obj, i9, ((Float) objUnwrap).floatValue());
            } else if (Double.TYPE == cls) {
                Array.setDouble(obj, i9, ((Double) objUnwrap).doubleValue());
            } else if (Character.TYPE == cls) {
                Array.setChar(obj, i9, ((Character) objUnwrap).charValue());
            } else if (Boolean.TYPE == cls) {
                Array.setBoolean(obj, i9, ((Boolean) objUnwrap).booleanValue());
            } else {
                Array.set(obj, i9, objUnwrap);
            }
            if (length >= length2 || i10 != length || (i2 = i7 + 1) >= objArr.length) {
                i8 = i10;
            } else {
                length = Array.getLength(objArr[i2]);
                i7 = i2;
                i8 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static AbstractC3612feyxiexzfUjhhgtg m5055Ujhhgtgfeyxiexzf(int i) {
        if (i != 0) {
            return i != 1 ? new C0945feyxiexzfUjhhgtg() : new C3063Ujhhgtgfeyxiexzf();
        }
        return new C0945feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int[] m5056Ujhhgtgfeyxiexzf(Object obj) {
        int iM555Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m555Ujhhgtgfeyxiexzf(obj.getClass());
        int[] iArr = new int[iM555Ujhhgtgfeyxiexzf];
        if (iM555Ujhhgtgfeyxiexzf != 0) {
            int length = Array.getLength(obj);
            iArr[0] = length;
            if (length != 0) {
                for (int i = 1; i < iM555Ujhhgtgfeyxiexzf; i++) {
                    obj = Array.get(obj, 0);
                    if (obj == null) {
                        break;
                    }
                    iArr[i] = Array.getLength(obj);
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m5057Ujhhgtgfeyxiexzf(View view) {
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) view.getTag();
        if (ujhhgtgfeyxiexzf == null || ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == null) {
            return;
        }
        ((WindowManager) ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf().getSystemService("window")).removeViewImmediate((View) view.getParent());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Executor m5058Ujhhgtgfeyxiexzf() {
        if (f10961Ujhhgtgfeyxiexzf == null) {
            synchronized (AbstractC3516feyxiexzfUjhhgtg.class) {
                try {
                    if (f10961Ujhhgtgfeyxiexzf == null) {
                        f10961Ujhhgtgfeyxiexzf = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10961Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final Activity m5059Ujhhgtgfeyxiexzf(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5059Ujhhgtgfeyxiexzf(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static Object m5060Ujhhgtgfeyxiexzf(int i, Object obj) throws C1862Ujhhgtgfeyxiexzf {
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("getIndex: ", obj, ", index=", Integer.valueOf(i));
        try {
            return obj instanceof List ? ((List) obj).get(i) : Primitive.wrap(Array.get(obj, i), (Class<?>) AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(obj.getClass()));
        } catch (IndexOutOfBoundsException e) {
            throw new C1862Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final int m5061Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf, String str) {
        C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf = abstractC0728Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf;
        m5067Ujhhgtgfeyxiexzf(abstractC0728Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg);
        int iMo1118Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1118Ujhhgtgfeyxiexzf(str);
        if (iMo1118Ujhhgtgfeyxiexzf != -3 || !abstractC0728Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf.f1298Ujhhgtgfeyxiexzf) {
            return iMo1118Ujhhgtgfeyxiexzf;
        }
        C2965Ujhhgtgfeyxiexzf c2965Ujhhgtgfeyxiexzf = abstractC0728Ujhhgtgfeyxiexzf.f2999Ujhhgtgfeyxiexzf;
        C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg = new C2550feyxiexzfUjhhgtg(interfaceC1121feyxiexzfUjhhgtg, 3, abstractC0728Ujhhgtgfeyxiexzf);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2965Ujhhgtgfeyxiexzf.f9276Ujhhgtgfeyxiexzf;
        Map map = (Map) concurrentHashMap.get(interfaceC1121feyxiexzfUjhhgtg);
        C2466feyxiexzfUjhhgtg c2466feyxiexzfUjhhgtg = f10968Ujhhgtgfeyxiexzf;
        Object obj = map != null ? map.get(c2466feyxiexzfUjhhgtg) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c2550feyxiexzfUjhhgtg.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC1121feyxiexzfUjhhgtg);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC1121feyxiexzfUjhhgtg, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c2466feyxiexzfUjhhgtg, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final boolean m5062Ujhhgtgfeyxiexzf(AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (abstractC0728Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf.f1293Ujhhgtgfeyxiexzf) {
            return true;
        }
        List annotations = interfaceC1121feyxiexzfUjhhgtg.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC0126Ujhhgtgfeyxiexzf) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static boolean m5063Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static int m5064Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static Typeface m5065Ujhhgtgfeyxiexzf(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC3611Ujhhgtgfeyxiexzf.m5212Ujhhgtgfeyxiexzf(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static int m5066Ujhhgtgfeyxiexzf(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final void m5067Ujhhgtgfeyxiexzf(AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1119Ujhhgtgfeyxiexzf(), C1189feyxiexzfUjhhgtg.f4474Ujhhgtgfeyxiexzf)) {
            C0136Ujhhgtgfeyxiexzf c0136Ujhhgtgfeyxiexzf = abstractC0728Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m5068Ujhhgtgfeyxiexzf(int i, Object obj) {
        Class clsM556Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(obj.getClass());
        if (i < 1) {
            return Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf, 0);
        }
        int[] iArrM5056Ujhhgtgfeyxiexzf = m5056Ujhhgtgfeyxiexzf(obj);
        int i2 = iArrM5056Ujhhgtgfeyxiexzf[0];
        int i3 = i * i2;
        iArrM5056Ujhhgtgfeyxiexzf[0] = i3;
        Object objNewInstance = Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf, iArrM5056Ujhhgtgfeyxiexzf);
        for (int i4 = 0; i4 < i3; i4 += i2) {
            System.arraycopy(obj, 0, objNewInstance, i4, i2);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static AbstractList m5069Ujhhgtgfeyxiexzf(int i, List list) {
        if (i < 1) {
            return list instanceof Queue ? new LinkedList() : new ArrayList(0);
        }
        AbstractList linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        if (i != 1) {
            while (true) {
                int i2 = i - 1;
                if (i <= 1) {
                    break;
                }
                linkedList.addAll(list);
                i = i2;
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final void m5070Ujhhgtgfeyxiexzf(C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, boolean z) {
        Object obj = C2774Ujhhgtgfeyxiexzf.f8771Ujhhgtgfeyxiexzf.get(c2774Ujhhgtgfeyxiexzf);
        Throwable thMo4052Ujhhgtgfeyxiexzf = c2774Ujhhgtgfeyxiexzf.mo4052Ujhhgtgfeyxiexzf(obj);
        Object c0919feyxiexzfUjhhgtg = thMo4052Ujhhgtgfeyxiexzf != null ? new C0919feyxiexzfUjhhgtg(thMo4052Ujhhgtgfeyxiexzf) : c2774Ujhhgtgfeyxiexzf.mo4053Ujhhgtgfeyxiexzf(obj);
        if (!z) {
            interfaceC3704Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
            return;
        }
        C3194feyxiexzfUjhhgtg c3194feyxiexzfUjhhgtg = (C3194feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
        AbstractC3705feyxiexzfUjhhgtg abstractC3705feyxiexzfUjhhgtg = c3194feyxiexzfUjhhgtg.f9874Ujhhgtgfeyxiexzf;
        Object obj2 = c3194feyxiexzfUjhhgtg.f9876Ujhhgtgfeyxiexzf;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = abstractC3705feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf;
        Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, obj2);
        C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg = objM2759Ujhhgtgfeyxiexzf != AbstractC1245feyxiexzfUjhhgtg.f4587Ujhhgtgfeyxiexzf ? AbstractC3594Ujhhgtgfeyxiexzf.m5198feyxiexzfUjhhgtg(abstractC3705feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf) : null;
        try {
            c3194feyxiexzfUjhhgtg.f9874Ujhhgtgfeyxiexzf.mo2588Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        } finally {
            if (c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg == null || c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg.m3295feyxiexzfUjhhgtg()) {
                AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m5071feyxiexzfUjhhgtg(Object obj, int i, Object obj2) throws C1862Ujhhgtgfeyxiexzf {
        try {
            Object objUnwrap = Primitive.unwrap(obj2);
            if (obj instanceof List) {
                ((List) obj).set(i, objUnwrap);
            } else {
                Array.set(obj, i, objUnwrap);
            }
        } catch (IllegalArgumentException e) {
            ArrayStoreException arrayStoreException = new ArrayStoreException(e.getMessage());
            throw new C1862Ujhhgtgfeyxiexzf(arrayStoreException.getMessage(), arrayStoreException);
        } catch (IndexOutOfBoundsException e2) {
            throw new C1862Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "Index ", " out-of-bounds for length ", obj instanceof List ? ((List) obj).size() : Array.getLength(obj)), e2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m5072feyxiexzfUjhhgtg(View view, C0226Ujhhgtgfeyxiexzf c0226Ujhhgtgfeyxiexzf) {
        C3385Ujhhgtgfeyxiexzf c3385Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf.f1507Ujhhgtgfeyxiexzf;
        if (c3385Ujhhgtgfeyxiexzf == null || !c3385Ujhhgtgfeyxiexzf.f10580Ujhhgtgfeyxiexzf) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
            elevation += ((View) parent).getElevation();
        }
        C0223Ujhhgtgfeyxiexzf c0223Ujhhgtgfeyxiexzf = c0226Ujhhgtgfeyxiexzf.f1527Ujhhgtgfeyxiexzf;
        if (c0223Ujhhgtgfeyxiexzf.f1517Ujhhgtgfeyxiexzf != elevation) {
            c0223Ujhhgtgfeyxiexzf.f1517Ujhhgtgfeyxiexzf = elevation;
            c0226Ujhhgtgfeyxiexzf.m1376Ujhhgtgfeyxiexzf();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m5073feyxiexzfUjhhgtg(Activity activity, View view) {
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        FrameLayout frameLayout = new FrameLayout(activity);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 16;
        layoutParams.format = -2;
        layoutParams.type = 1003;
        layoutParams.flags = 201327872;
        layoutParams.softInputMode = 16;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        windowManager.addView(frameLayout, layoutParams);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final void m5074feyxiexzfUjhhgtg(int[] iArr, int[] iArr2, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C0296Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf(), arrayList);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final void m5075feyxiexzfUjhhgtg(int i, int i2, InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC1121feyxiexzfUjhhgtg.mo1121Ujhhgtgfeyxiexzf(i4));
            }
            i3 >>>= 1;
        }
        throw new C0296Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf(), arrayList);
    }
}
