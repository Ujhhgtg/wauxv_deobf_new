package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC0615Ujhhgtgfeyxiexzf;
import p000.AbstractC1192feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3100Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
            this();
        }

        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m987deprecated_get(String str) {
            return get(str);
        }

        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m988deprecated_parse(String str) {
            return parse(str);
        }

        public final MediaType get(String str) {
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2704Ujhhgtgfeyxiexzf("No subtype found for: \"", str, '\"').toString());
            }
            String strGroup = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = strGroup.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
                }
                String strGroup2 = matcher2.group(1);
                if (strGroup2 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup3 = matcher2.group(2);
                    if (strGroup3 == null) {
                        strGroup3 = matcher2.group(3);
                    } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                        strGroup3 = AbstractC1225feyxiexzfUjhhgtg.m2699Ujhhgtgfeyxiexzf(1, 1, strGroup3);
                    }
                    arrayList.add(strGroup2);
                    arrayList.add(strGroup3);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        public final MediaType parse(String str) {
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, AbstractC3100Ujhhgtgfeyxiexzf abstractC3100Ujhhgtgfeyxiexzf) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m985deprecated_subtype() {
        return this.subtype;
    }

    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final String m986deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        int i = 0;
        int iM1882Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1882Ujhhgtgfeyxiexzf(0, this.parameterNamesAndValues.length - 1, 2);
        if (iM1882Ujhhgtgfeyxiexzf < 0) {
            return null;
        }
        while (!AbstractC1192feyxiexzfUjhhgtg.m2679feyxiexzfUjhhgtg(this.parameterNamesAndValues[i], str)) {
            if (i == iM1882Ujhhgtgfeyxiexzf) {
                return null;
            }
            i += 2;
        }
        return this.parameterNamesAndValues[i + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
