package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1795 {

    public StringBuilder f5998;

    public String f5999;

    public String f6000;

    public char f6001;

    public StringBuilder f6002;

    public int f5995 = 1;

    public final StringBuilder f5996 = new StringBuilder();

    public final ArrayList f5997 = new ArrayList();

    public boolean f6003 = false;

    public final void m3549() {
        if (this.f6003) {
            String strM2863 = AbstractC1228.m2863(this.f6000);
            StringBuilder sb = this.f6002;
            String strM2864 = sb != null ? AbstractC1228.m2863(sb.toString()) : null;
            String str = this.f5999;
            C1794 c1794 = new C1794();
            c1794.f5992 = str;
            c1794.f5993 = strM2863;
            c1794.f5994 = strM2864;
            this.f5997.add(c1794);
            this.f5998 = null;
            this.f6003 = false;
            this.f5999 = null;
            this.f6000 = null;
            this.f6002 = null;
        }
    }
}
