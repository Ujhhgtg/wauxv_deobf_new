package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC1194;
import p000.AbstractC2207;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            linkedHashMap.put(key != null ? key.toLowerCase(Locale.US) : null, entry.getValue());
        }
        this.authParams = Collections.unmodifiableMap(linkedHashMap);
    }

    public final Map<String, String> m788deprecated_authParams() {
        return this.authParams;
    }

    public final Charset m789deprecated_charset() {
        return charset();
    }

    public final String m790deprecated_realm() {
        return realm();
    }

    public final String m791deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return AbstractC2207.m4087(challenge.scheme, this.scheme) && AbstractC2207.m4087(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + AbstractC1194.m2775(899, 31, this.scheme);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.authParams);
        linkedHashMap.put("charset", charset.name());
        return new Challenge(this.scheme, linkedHashMap);
    }

    public Challenge(String str, String str2) {
        this(str, (Map<String, String>) Collections.singletonMap("realm", str2));
    }
}
