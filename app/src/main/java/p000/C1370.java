package p000;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1370 {

    public String f4933;

    public String f4934;

    public List f4935;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1370)) {
            return false;
        }
        C1370 c1370 = (C1370) obj;
        return Objects.equals(this.f4933, c1370.f4933) && Objects.equals(this.f4934, c1370.f4934) && Objects.equals(this.f4935, c1370.f4935);
    }

    public final int hashCode() {
        return Objects.hash(this.f4933, this.f4934, this.f4935);
    }
}
