package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0067 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1057;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f1058;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1059;

    public /* synthetic */ C0067(Object obj, int i) {
        this.f1057 = i;
        this.f1059 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1057) {
            case 0:
                return this.f1058 < ((AbstractC0070) this.f1059).mo1087();
            case 1:
                return this.f1058 < ((Object[]) this.f1059).length;
            case 2:
                return this.f1058 > 0;
            case 3:
                return this.f1058 < ((byte[]) this.f1059).length;
            case 4:
                return this.f1058 < ((int[]) this.f1059).length;
            case 5:
                return this.f1058 < ((long[]) this.f1059).length;
            case 6:
                return this.f1058 < ((short[]) this.f1059).length;
            default:
                return this.f1058 < ((ViewGroup) this.f1059).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1057) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0070 abstractC0070 = (AbstractC0070) this.f1059;
                int i = this.f1058;
                this.f1058 = i + 1;
                return abstractC0070.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f1059;
                    int i2 = this.f1058;
                    this.f1058 = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f1058--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                InterfaceC2715 interfaceC2715 = (InterfaceC2715) this.f1059;
                int iMo3641 = interfaceC2715.mo3641();
                int i3 = this.f1058;
                this.f1058 = i3 - 1;
                return interfaceC2715.mo3644(iMo3641 - i3);
            case 3:
                int i4 = this.f1058;
                byte[] bArr = (byte[]) this.f1059;
                if (i4 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1058));
                }
                this.f1058 = i4 + 1;
                return new C3529(bArr[i4]);
            case 4:
                int i5 = this.f1058;
                int[] iArr = (int[]) this.f1059;
                if (i5 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1058));
                }
                this.f1058 = i5 + 1;
                return new C3534(iArr[i5]);
            case 5:
                int i6 = this.f1058;
                long[] jArr = (long[]) this.f1059;
                if (i6 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1058));
                }
                this.f1058 = i6 + 1;
                return new C3539(jArr[i6]);
            case 6:
                int i7 = this.f1058;
                short[] sArr = (short[]) this.f1059;
                if (i7 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f1058));
                }
                this.f1058 = i7 + 1;
                return new C3544(sArr[i7]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f1059;
                int i8 = this.f1058;
                this.f1058 = i8 + 1;
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1057) {
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
                ViewGroup viewGroup = (ViewGroup) this.f1059;
                int i = this.f1058 - 1;
                this.f1058 = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public C0067(InterfaceC2715 interfaceC2715) {
        this.f1057 = 2;
        this.f1059 = interfaceC2715;
        this.f1058 = interfaceC2715.mo3641();
    }
}
