package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0060 implements Iterator, InterfaceC1737 {

    public final /* synthetic */ int f992;

    public int f993;

    public final Object f994;

    public /* synthetic */ C0060(int i, Object obj) {
        this.f992 = i;
        this.f994 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f992) {
            case 0:
                return this.f993 < ((AbstractC0063) this.f994).mo943();
            case 1:
                return this.f993 < ((Object[]) this.f994).length;
            case 2:
                return this.f993 > 0;
            case 3:
                return this.f993 < ((byte[]) this.f994).length;
            case 4:
                return this.f993 < ((int[]) this.f994).length;
            case 5:
                return this.f993 < ((long[]) this.f994).length;
            case 6:
                return this.f993 < ((short[]) this.f994).length;
            default:
                return this.f993 < ((ViewGroup) this.f994).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f992) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0063 abstractC0063 = (AbstractC0063) this.f994;
                int i = this.f993;
                this.f993 = i + 1;
                return abstractC0063.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f994;
                    int i2 = this.f993;
                    this.f993 = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f993--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                InterfaceC2654 interfaceC2654 = (InterfaceC2654) this.f994;
                int iMo3473 = interfaceC2654.mo3473();
                int i3 = this.f993;
                this.f993 = i3 - 1;
                return interfaceC2654.mo3476(iMo3473 - i3);
            case 3:
                int i4 = this.f993;
                byte[] bArr = (byte[]) this.f994;
                if (i4 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f993));
                }
                this.f993 = i4 + 1;
                return new C3472(bArr[i4]);
            case 4:
                int i5 = this.f993;
                int[] iArr = (int[]) this.f994;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f993));
                }
                this.f993 = i5 + 1;
                return new C3477(iArr[i5]);
            case 5:
                int i6 = this.f993;
                long[] jArr = (long[]) this.f994;
                if (i6 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f993));
                }
                this.f993 = i6 + 1;
                return new C3482(jArr[i6]);
            case 6:
                int i7 = this.f993;
                short[] sArr = (short[]) this.f994;
                if (i7 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f993));
                }
                this.f993 = i7 + 1;
                return new C3487(sArr[i7]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f994;
                int i8 = this.f993;
                this.f993 = i8 + 1;
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f992) {
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
                ViewGroup viewGroup = (ViewGroup) this.f994;
                int i = this.f993 - 1;
                this.f993 = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public C0060(InterfaceC2654 interfaceC2654) {
        this.f992 = 2;
        this.f994 = interfaceC2654;
        this.f993 = interfaceC2654.mo3473();
    }
}
