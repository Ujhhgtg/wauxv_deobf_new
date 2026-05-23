package p000;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2707 implements InterfaceC2225, Serializable {

    public C3408 f8717;

    public C3408 f8718;

    public String f8719;

    public AbstractC2707 f8720;

    public InterfaceC2225[] f8721;

    public final int f8722;

    public int f8723 = 0;

    public int f8724 = -1;

    public AbstractC2707(int i) {
        this.f8722 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        InterfaceC2225 interfaceC2225 = (InterfaceC2225) obj;
        int length = m4710().length + 1;
        InterfaceC2225[] interfaceC2225Arr = new InterfaceC2225[length];
        System.arraycopy(this.f8721, 0, interfaceC2225Arr, 0, this.f8723);
        InterfaceC2225[] interfaceC2225Arr2 = this.f8721;
        int i = this.f8723;
        System.arraycopy(interfaceC2225Arr2, i, interfaceC2225Arr, i + 1, (length - i) - 1);
        this.f8721 = interfaceC2225Arr;
        int i2 = this.f8723;
        this.f8723 = i2 + 1;
        interfaceC2225Arr[i2] = interfaceC2225;
        this.f8724 = -1;
        interfaceC2225.mo1437(this);
    }

    @Override // p000.InterfaceC2225
    public int getLineNumber() {
        return this.f8717.f10747;
    }

    @Override // p000.InterfaceC2225
    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (C3408 c3408 = this.f8717; c3408 != null; c3408 = c3408.f10751) {
            sb.append(c3408.f10750);
            if (!c3408.f10750.equals(".")) {
                sb.append(" ");
            }
            if (c3408 == this.f8718 || c3408.f10750.equals("{") || c3408.f10750.equals(";")) {
                break;
            }
        }
        return sb.toString();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8723 < m4710().length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8723 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        int i = this.f8723;
        this.f8723 = i + 1;
        this.f8724 = i;
        return interfaceC2225Arr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8723;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        int i = this.f8723 - 1;
        this.f8723 = i;
        this.f8724 = i;
        return interfaceC2225Arr[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8723 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f8724;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.f8723 = i;
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        int length = interfaceC2225Arr.length - 1;
        InterfaceC2225[] interfaceC2225Arr2 = new InterfaceC2225[length];
        System.arraycopy(interfaceC2225Arr, 0, interfaceC2225Arr2, 0, i);
        InterfaceC2225[] interfaceC2225Arr3 = this.f8721;
        int i2 = this.f8723;
        System.arraycopy(interfaceC2225Arr3, i2 + 1, interfaceC2225Arr2, i2, length - i2);
        this.f8721 = interfaceC2225Arr2;
        this.f8724 = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        InterfaceC2225 interfaceC2225 = (InterfaceC2225) obj;
        int i = this.f8724;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.f8721[i] = interfaceC2225;
    }

    public String toString() {
        return InterfaceC2337.f7521[this.f8722];
    }

    @Override // p000.InterfaceC2225
    public void mo1437(AbstractC2707 abstractC2707) {
        this.f8720 = abstractC2707;
    }

    public final void m4708(String str) {
        PrintStream printStream = System.out;
        StringBuilder sbM4753 = AbstractC2784.m4753(str);
        sbM4753.append(toString());
        printStream.println(sbM4753.toString());
        if (this.f8721 == null) {
            return;
        }
        int i = 0;
        while (true) {
            InterfaceC2225[] interfaceC2225Arr = this.f8721;
            if (i >= interfaceC2225Arr.length) {
                return;
            }
            InterfaceC2225 interfaceC2225 = interfaceC2225Arr[i];
            if (interfaceC2225 != null) {
                ((AbstractC2707) interfaceC2225).m4708(AbstractC2784.m4748(str, " "));
            }
            i++;
        }
    }

    @Override // p000.InterfaceC2225
    public String mo1450() {
        String str = this.f8719;
        if (str != null) {
            return str;
        }
        AbstractC2707 abstractC2707 = this.f8720;
        return abstractC2707 != null ? abstractC2707.mo1450() : "<unknown file>";
    }

    public final void m4709(InterfaceC2225 interfaceC2225, int i) {
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        if (interfaceC2225Arr == null) {
            this.f8721 = new InterfaceC2225[i + 1];
        } else if (i >= interfaceC2225Arr.length) {
            InterfaceC2225[] interfaceC2225Arr2 = new InterfaceC2225[i + 1];
            System.arraycopy(interfaceC2225Arr, 0, interfaceC2225Arr2, 0, interfaceC2225Arr.length);
            this.f8721 = interfaceC2225Arr2;
        }
        this.f8721[i] = interfaceC2225;
    }

    @Override // p000.InterfaceC2225
    public Object mo306(C0550 c0550, RunnableC1668 runnableC1668) {
        throw new C1669("Unimplemented or inappropriate for ".concat(getClass().getName()));
    }

    public final InterfaceC2225[] m4710() {
        if (this.f8721 == null) {
            this.f8721 = new InterfaceC2225[0];
        }
        return this.f8721;
    }
}
