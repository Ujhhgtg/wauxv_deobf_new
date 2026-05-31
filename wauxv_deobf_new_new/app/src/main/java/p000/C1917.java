package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲀᲇᤝᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1917 extends AbstractC0073 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6330;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1916 f6331;

    public /* synthetic */ C1917(C1916 c1916, int i) {
        this.f6330 = i;
        this.f6331 = c1916;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f6330) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f6330) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6330) {
            case 0:
                this.f6331.clear();
                break;
            default:
                this.f6331.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f6330) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1916 c1916 = this.f6331;
                c1916.getClass();
                int iM3864 = c1916.m3864(entry.getKey());
                if (iM3864 < 0) {
                    return false;
                }
                return AbstractC1469.m3322(c1916.f6318[iM3864], entry.getValue());
            default:
                return this.f6331.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f6330) {
            case 0:
                C1916 c1916 = this.f6331;
                c1916.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM3864 = c1916.m3864(entry.getKey());
                        if (!(iM3864 < 0 ? false : AbstractC1469.m3322(c1916.f6318[iM3864], entry.getValue()))) {
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
        switch (this.f6330) {
            case 0:
                break;
        }
        return this.f6331.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6330) {
            case 0:
                C1916 c1916 = this.f6331;
                c1916.getClass();
                return new C1913(c1916, 0);
            default:
                C1916 c1917 = this.f6331;
                c1917.getClass();
                return new C1913(c1917, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f6330) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C1916 c1916 = this.f6331;
                c1916.m3861();
                int iM3864 = c1916.m3864(entry.getKey());
                if (iM3864 < 0 || !AbstractC1469.m3322(c1916.f6318[iM3864], entry.getValue())) {
                    return false;
                }
                c1916.m3867(iM3864);
                return true;
            default:
                C1916 c1917 = this.f6331;
                c1917.m3861();
                int iM3865 = c1917.m3864(obj);
                if (iM3865 < 0) {
                    return false;
                }
                c1917.m3867(iM3865);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f6330) {
            case 0:
                this.f6331.m3861();
                break;
            default:
                this.f6331.m3861();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f6330) {
            case 0:
                this.f6331.m3861();
                break;
            default:
                this.f6331.m3861();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo1093() {
        switch (this.f6330) {
            case 0:
                break;
        }
        return this.f6331.f6325;
    }
}
