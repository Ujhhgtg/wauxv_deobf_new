package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲈᤞᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0482 implements InterfaceC0966, InterfaceC0992, InterfaceC2333 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ByteBuffer f2130;

    public C0482(int i, ByteBuffer byteBuffer) {
        this.f2129 = i;
        switch (i) {
            case 2:
                this.f2130 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f2130 = byteBuffer;
                break;
        }
    }

    @Override // p000.InterfaceC0992
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f2130;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p000.InterfaceC2333
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo1900(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f2129) {
            case 3:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f2130) {
                    this.f2130.position(0);
                    messageDigest.update(this.f2130.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f2130) {
                    this.f2130.position(0);
                    messageDigest.update(this.f2130.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean m1901() {
        String[] strArr = AbstractC1471.f5234;
        ByteBuffer byteBuffer = this.f2130;
        ByteBuffer byteBuffer2 = null;
        if (byteBuffer == null) {
            "buffer";
            byteBuffer = null;
        }
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer3 = this.f2130;
        if (byteBuffer3 == null) {
            "buffer";
        } else {
            byteBuffer2 = byteBuffer3;
        }
        return iLimit - byteBuffer2.position() <= 1;
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public int mo1248() {
        return (mo1252() << 8) | mo1252();
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Object mo754() {
        ByteBuffer byteBuffer = this.f2130;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public short mo1252() throws C0991 {
        ByteBuffer byteBuffer = this.f2130;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0991();
    }

    @Override // p000.InterfaceC0992
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public int mo1257(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f2130;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public C0482(int i) {
        this.f2129 = i;
        switch (i) {
            case 3:
                this.f2130 = ByteBuffer.allocate(8);
                break;
            case 4:
                this.f2130 = ByteBuffer.allocate(4);
                break;
        }
    }

    @Override // p000.InterfaceC0966
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public void mo753() {
    }
}
