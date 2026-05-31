package bsh;

import com.umeng.analytics.pro.bc;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p000.AbstractC1095;
import p000.AbstractC2844;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Modifiers implements Serializable, Cloneable {
    private static final int ACCESS_MODIFIERS = 7;
    public static final int CLASS = 0;
    public static final Map<String, Integer> CONST;
    public static final int CONSTRUCTOR = 5;
    public static final int FIELD = 3;
    public static final int INTERFACE = 1;
    public static final int METHOD = 2;
    public static final int PARAMETER = 4;
    private static final long serialVersionUID = 1;
    private int context;
    private int modifiers = 0;
    private String type;
    private int valid;

    static {
        HashMap map = new HashMap(17);
        CONST = map;
        map.put("public", 1);
        map.put("private", 2);
        map.put("protected", 4);
        map.put("static", 8);
        map.put("final", 16);
        map.put("synchronized", 32);
        map.put("volatile", 64);
        map.put("transient", 128);
        map.put("native", Integer.valueOf(bc.e));
        map.put("interface", 512);
        map.put("abstract", 1024);
        map.put("strict", 2048);
        map.put("synthetic", 4096);
        map.put("annotation", 8192);
        map.put("enum", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        map.put("mandated", 32768);
        map.put("default", 65536);
    }

    public Modifiers(int i) {
        appliedContext(i);
    }

    private void appliedContext(int i) {
        this.context = i;
        if (i == 0) {
            this.valid = Modifier.classModifiers();
            this.type = "Class";
            return;
        }
        if (i == 1) {
            this.valid = Modifier.interfaceModifiers();
            this.type = "Interface";
            return;
        }
        if (i == 2) {
            this.valid = Modifier.methodModifiers() | CONST.get("default").intValue();
            this.type = "Method";
            return;
        }
        if (i == 3) {
            this.valid = Modifier.fieldModifiers() | CONST.get("enum").intValue();
            this.type = "Field";
        } else if (i == 4) {
            this.valid = Modifier.parameterModifiers();
            this.type = "Parameter";
        } else if (i != 5) {
            this.valid = 0;
            this.type = "Unknown";
        } else {
            this.valid = Modifier.constructorModifiers();
            this.type = "Constructor";
        }
    }

    private int toModifier(String str) {
        Integer num = CONST.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(AbstractC1095.m2800("Unknown modifier: '", str, "'"));
    }

    public void addModifier(String str) {
        addModifier(toModifier(str));
    }

    public void addModifiers(int i) {
        for (int i2 = 1; i2 <= i; i2 *= 2) {
            if ((i & i2) != 0) {
                addModifier(i2);
            }
        }
    }

    public void changeContext(int i) {
        int i2 = this.modifiers;
        this.modifiers = 0;
        appliedContext(i);
        addModifiers(i2);
    }

    public int getModifiers() {
        return this.modifiers;
    }

    public boolean hasModifier(String str) {
        return hasModifier(toModifier(str));
    }

    public boolean isAppliedContext(int i) {
        return this.context == i;
    }

    public void setConstant() {
        this.modifiers = 25;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Modifiers: ");
        sb.append(Modifier.toString(this.modifiers));
        int i = this.modifiers;
        Map<String, Integer> map = CONST;
        if ((i & map.get("enum").intValue()) != 0) {
            str = " enum";
        } else {
            str = (this.modifiers & map.get("default").intValue()) != 0 ? " default" : "";
        }
        sb.append(str);
        return sb.toString();
    }

    public void addModifier(int i) {
        if ((this.valid & i) == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.type);
            sb.append(" cannot be declared '");
            throw new IllegalStateException(AbstractC2844.m4786(sb, toModifier(i), "'"));
        }
        if (i < 7) {
            int i2 = this.modifiers;
            if ((i2 & 7) > 0 && (i2 | i) != i2) {
                throw new IllegalStateException("public/private/protected cannot be used in combination.");
            }
        }
        this.modifiers = i | this.modifiers;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Modifiers m298clone() {
        return (Modifiers) super.clone();
    }

    public boolean hasModifier(int i) {
        return (i & this.modifiers) != 0;
    }

    private String toModifier(int i) {
        for (String str : CONST.keySet()) {
            if (i == CONST.get(str).intValue()) {
                return str;
            }
        }
        return String.valueOf(i);
    }
}
