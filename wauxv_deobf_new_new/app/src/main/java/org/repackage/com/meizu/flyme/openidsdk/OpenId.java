package org.repackage.com.meizu.flyme.openidsdk;

/* JADX INFO: loaded from: classes.dex */
class OpenId {
    long a;
    String b;
    String c;
    int d;

    public OpenId(String str) {
        this.c = str;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b() {
        this.a = 0L;
    }

    public void a(long j) {
        this.a = j;
    }

    public void a(String str) {
        this.b = str;
    }

    public boolean a() {
        return this.a > System.currentTimeMillis();
    }
}
