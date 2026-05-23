package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0505 implements InterfaceC0962, InterfaceC0988, InterfaceC2300 {

    public final /* synthetic */ int f2173;

    public ByteBuffer f2174;

    public C0505(int i, ByteBuffer byteBuffer) {
        this.f2173 = i;
        switch (i) {
            case 2:
                this.f2174 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f2174 = byteBuffer;
                break;
        }
    }

    @Override // p000.InterfaceC0988
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f2174;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p000.InterfaceC2300
    public void mo1806(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f2173) {
            case 3:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f2174) {
                    this.f2174.position(0);
                    messageDigest.update(this.f2174.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f2174) {
                    this.f2174.position(0);
                    messageDigest.update(this.f2174.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    public boolean m1807() {
        String[] strArr = AbstractC1574.f5469;
        ByteBuffer byteBuffer = this.f2174;
        ByteBuffer byteBuffer2 = null;
        if (byteBuffer == null) {
            "buffer";
            byteBuffer = null;
        }
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer3 = this.f2174;
        if (byteBuffer3 == null) {
            "buffer";
        } else {
            byteBuffer2 = byteBuffer3;
        }
        return iLimit - byteBuffer2.position() <= 1;
    }

    @Override // p000.InterfaceC0988
    public int mo1102() {
        return (mo1106() << 8) | mo1106();
    }

    @Override // p000.InterfaceC0962
    public Object mo611() {
        ByteBuffer byteBuffer = this.f2174;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.InterfaceC0988
    public short mo1106() throws C0987 {
        ByteBuffer byteBuffer = this.f2174;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0987();
    }

    @Override // p000.InterfaceC0988
    public int mo1111(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f2174;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public C0505(int i) {
        this.f2173 = i;
        switch (i) {
            case 3:
                this.f2174 = ByteBuffer.allocate(8);
                break;
            case 4:
                this.f2174 = ByteBuffer.allocate(4);
                break;
        }
    }

    @Override // p000.InterfaceC0962
    public void mo610() {
    }
}
