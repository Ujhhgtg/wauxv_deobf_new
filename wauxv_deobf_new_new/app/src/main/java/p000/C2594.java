package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2594 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f8242;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f8243;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f8244;

    public /* synthetic */ C2594(int i, String str, String str2) {
        this.f8242 = i;
        this.f8243 = str;
        this.f8244 = str2;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f8242) {
            case 0:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C2594(1, this.f8243, this.f8244);
                c1023.f3740 = new C2504(19);
                break;
            default:
                C1334 c1334 = (C1334) obj;
                c1334.m3154(this.f8243);
                C0700 c0700 = new C0700();
                C2593 c2593 = new C2593(this.f8244, 0);
                C0188 c0188 = new C0188();
                c2593.invoke(c0188);
                c0700.f2679 = c0188;
                c1334.f4791 = c0700;
                break;
        }
        return C3554.UNIT;
    }
}
