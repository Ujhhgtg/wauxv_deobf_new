package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2594feyxiexzfUjhhgtg implements InterfaceC3106Ujhhgtgfeyxiexzf, InterfaceC3132Ujhhgtgfeyxiexzf, InterfaceC1468feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8396Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ByteBuffer f8397Ujhhgtgfeyxiexzf;

    public C2594feyxiexzfUjhhgtg(int i, ByteBuffer byteBuffer) {
        this.f8396Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 2:
                this.f8397Ujhhgtgfeyxiexzf = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f8397Ujhhgtgfeyxiexzf = byteBuffer;
                break;
        }
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f8397Ujhhgtgfeyxiexzf;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p000.InterfaceC1468feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1736Ujhhgtgfeyxiexzf(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f8396Ujhhgtgfeyxiexzf) {
            case 3:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f8397Ujhhgtgfeyxiexzf) {
                    this.f8397Ujhhgtgfeyxiexzf.position(0);
                    messageDigest.update(this.f8397Ujhhgtgfeyxiexzf.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f8397Ujhhgtgfeyxiexzf) {
                    this.f8397Ujhhgtgfeyxiexzf.position(0);
                    messageDigest.update(this.f8397Ujhhgtgfeyxiexzf.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean m3851Ujhhgtgfeyxiexzf() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        ByteBuffer byteBuffer = this.f8397Ujhhgtgfeyxiexzf;
        ByteBuffer byteBuffer2 = null;
        if (byteBuffer == null) {
            "buffer";
            byteBuffer = null;
        }
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer3 = this.f8397Ujhhgtgfeyxiexzf;
        if (byteBuffer3 == null) {
            "buffer";
        } else {
            byteBuffer2 = byteBuffer3;
        }
        return iLimit - byteBuffer2.position() <= 1;
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int mo3852Ujhhgtgfeyxiexzf() {
        return (mo3853Ujhhgtgfeyxiexzf() << 8) | mo3853Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public Object mo753Ujhhgtgfeyxiexzf() {
        ByteBuffer byteBuffer = this.f8397Ujhhgtgfeyxiexzf;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public short mo3853Ujhhgtgfeyxiexzf() throws C3131Ujhhgtgfeyxiexzf {
        ByteBuffer byteBuffer = this.f8397Ujhhgtgfeyxiexzf;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C3131Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC3132Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int mo3854Ujhhgtgfeyxiexzf(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f8397Ujhhgtgfeyxiexzf;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public C2594feyxiexzfUjhhgtg(int i) {
        this.f8396Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 3:
                this.f8397Ujhhgtgfeyxiexzf = ByteBuffer.allocate(8);
                break;
            case 4:
                this.f8397Ujhhgtgfeyxiexzf = ByteBuffer.allocate(4);
                break;
        }
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo752Ujhhgtgfeyxiexzf() {
    }
}
