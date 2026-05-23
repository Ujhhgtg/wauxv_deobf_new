package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1891 extends AbstractC0065 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C1890 f6257;

    public /* synthetic */ C1891(C1890 c1890, int i) {
        this.f6256 = i;
        this.f6257 = c1890;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f6256) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f6256) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6256) {
            case 0:
                this.f6257.clear();
                break;
            default:
                this.f6257.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f6256) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1890 c1890 = this.f6257;
                
                int iM3685 = c1890.m3685(entry.getKey());
                if (iM3685 < 0) {
                    return false;
                }
                return AbstractC2207.m4087(c1890.f6244[iM3685], entry.getValue());
            default:
                return this.f6257.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f6256) {
            case 0:
                C1890 c1890 = this.f6257;
                
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM3685 = c1890.m3685(entry.getKey());
                        if (!(iM3685 < 0 ? false : AbstractC2207.m4087(c1890.f6244[iM3685], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f6256) {
            case 0:
                break;
        }
        return this.f6257.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6256) {
            case 0:
                C1890 c1890 = this.f6257;
                
                return new C1887(c1890, 0);
            default:
                C1890 c1891 = this.f6257;
                
                return new C1887(c1891, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f6256) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1890 c1890 = this.f6257;
                c1890.m3682();
                int iM3685 = c1890.m3685(entry.getKey());
                if (iM3685 < 0 || !AbstractC2207.m4087(c1890.f6244[iM3685], entry.getValue())) {
                    return false;
                }
                c1890.m3688(iM3685);
                return true;
            default:
                C1890 c1891 = this.f6257;
                c1891.m3682();
                int iM3686 = c1891.m3685(obj);
                if (iM3686 < 0) {
                    return false;
                }
                c1891.m3688(iM3686);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f6256) {
            case 0:
                this.f6257.m3682();
                break;
            default:
                this.f6257.m3682();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f6256) {
            case 0:
                this.f6257.m3682();
                break;
            default:
                this.f6257.m3682();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC0065
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo946() {
        switch (this.f6256) {
            case 0:
                break;
        }
        return this.f6257.f6251;
    }
}
