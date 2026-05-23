package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2892 {

    public final String f9306;

    public final String f9307;

    public final ArrayList f9308 = new ArrayList();

    public String f9309;

    public C2892(String str, String str2) {
        this.f9306 = str;
        this.f9307 = str2;
    }

    public final String toString() {
        return "Tag: " + this.f9307 + ", " + this.f9308.size() + " children, Content: " + this.f9309;
    }

    public final void m4899(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != ' ' && cCharAt != '\n') {
                    this.f9309 = str;
                    return;
                }
            }
        }
    }
}
