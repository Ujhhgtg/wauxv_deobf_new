package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2930Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9216Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f9217Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f9218Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2930Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f9216Ujhhgtgfeyxiexzf = i;
        this.f9218Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9216Ujhhgtgfeyxiexzf) {
            case 0:
                return this.f9217Ujhhgtgfeyxiexzf < ((AbstractC2933Ujhhgtgfeyxiexzf) this.f9218Ujhhgtgfeyxiexzf).mo1287Ujhhgtgfeyxiexzf();
            case 1:
                return this.f9217Ujhhgtgfeyxiexzf < ((Object[]) this.f9218Ujhhgtgfeyxiexzf).length;
            case 2:
                return this.f9217Ujhhgtgfeyxiexzf > 0;
            case 3:
                return this.f9217Ujhhgtgfeyxiexzf < ((byte[]) this.f9218Ujhhgtgfeyxiexzf).length;
            case 4:
                return this.f9217Ujhhgtgfeyxiexzf < ((int[]) this.f9218Ujhhgtgfeyxiexzf).length;
            case 5:
                return this.f9217Ujhhgtgfeyxiexzf < ((long[]) this.f9218Ujhhgtgfeyxiexzf).length;
            case 6:
                return this.f9217Ujhhgtgfeyxiexzf < ((short[]) this.f9218Ujhhgtgfeyxiexzf).length;
            default:
                return this.f9217Ujhhgtgfeyxiexzf < ((ViewGroup) this.f9218Ujhhgtgfeyxiexzf).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9216Ujhhgtgfeyxiexzf) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC2933Ujhhgtgfeyxiexzf abstractC2933Ujhhgtgfeyxiexzf = (AbstractC2933Ujhhgtgfeyxiexzf) this.f9218Ujhhgtgfeyxiexzf;
                int i = this.f9217Ujhhgtgfeyxiexzf;
                this.f9217Ujhhgtgfeyxiexzf = i + 1;
                return abstractC2933Ujhhgtgfeyxiexzf.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f9218Ujhhgtgfeyxiexzf;
                    int i2 = this.f9217Ujhhgtgfeyxiexzf;
                    this.f9217Ujhhgtgfeyxiexzf = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f9217Ujhhgtgfeyxiexzf--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = (InterfaceC1121feyxiexzfUjhhgtg) this.f9218Ujhhgtgfeyxiexzf;
                int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
                int i3 = this.f9217Ujhhgtgfeyxiexzf;
                this.f9217Ujhhgtgfeyxiexzf = i3 - 1;
                return interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(iMo1120Ujhhgtgfeyxiexzf - i3);
            case 3:
                int i4 = this.f9217Ujhhgtgfeyxiexzf;
                byte[] bArr = (byte[]) this.f9218Ujhhgtgfeyxiexzf;
                if (i4 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9217Ujhhgtgfeyxiexzf));
                }
                this.f9217Ujhhgtgfeyxiexzf = i4 + 1;
                return new C1918Ujhhgtgfeyxiexzf(bArr[i4]);
            case 4:
                int i5 = this.f9217Ujhhgtgfeyxiexzf;
                int[] iArr = (int[]) this.f9218Ujhhgtgfeyxiexzf;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9217Ujhhgtgfeyxiexzf));
                }
                this.f9217Ujhhgtgfeyxiexzf = i5 + 1;
                return new C1916Ujhhgtgfeyxiexzf(iArr[i5]);
            case 5:
                int i6 = this.f9217Ujhhgtgfeyxiexzf;
                long[] jArr = (long[]) this.f9218Ujhhgtgfeyxiexzf;
                if (i6 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9217Ujhhgtgfeyxiexzf));
                }
                this.f9217Ujhhgtgfeyxiexzf = i6 + 1;
                return new C1923feyxiexzfUjhhgtg(jArr[i6]);
            case 6:
                int i7 = this.f9217Ujhhgtgfeyxiexzf;
                short[] sArr = (short[]) this.f9218Ujhhgtgfeyxiexzf;
                if (i7 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9217Ujhhgtgfeyxiexzf));
                }
                this.f9217Ujhhgtgfeyxiexzf = i7 + 1;
                return new C1926Ujhhgtgfeyxiexzf(sArr[i7]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f9218Ujhhgtgfeyxiexzf;
                int i8 = this.f9217Ujhhgtgfeyxiexzf;
                this.f9217Ujhhgtgfeyxiexzf = i8 + 1;
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9216Ujhhgtgfeyxiexzf) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f9218Ujhhgtgfeyxiexzf;
                int i = this.f9217Ujhhgtgfeyxiexzf - 1;
                this.f9217Ujhhgtgfeyxiexzf = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public C2930Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        this.f9216Ujhhgtgfeyxiexzf = 2;
        this.f9218Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
        this.f9217Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
    }
}
