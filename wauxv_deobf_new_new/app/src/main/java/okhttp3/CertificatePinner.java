package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import p000.AbstractC0280;
import p000.AbstractC0739;
import p000.AbstractC0741;
import p000.AbstractC0985;
import p000.AbstractC1469;
import p000.AbstractC1778;
import p000.AbstractC2647;
import p000.AbstractC2901;
import p000.AbstractC2902;
import p000.C0348;
import p000.C0516;
import p000.C1191;
import p000.InterfaceC1422;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* JADX INFO: compiled from: obf */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(AbstractC0739.m2308(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0985 abstractC0985) {
            this();
        }

        public final String pin(Certificate certificate) {
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).mo1962();
        }

        public final C0516 sha1Hash(X509Certificate x509Certificate) {
            return C0348.m1605(x509Certificate.getPublicKey().getEncoded()).mo1963("SHA-1");
        }

        public final C0516 sha256Hash(X509Certificate x509Certificate) {
            return C0348.m1605(x509Certificate.getPublicKey().getEncoded()).mo1963("SHA-256");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Pin {
        private final C0516 hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            if ((!str.startsWith("*.") || AbstractC2901.m4867(str, "*", 1, false, 4) != -1) && ((!str.startsWith("**.") || AbstractC2901.m4867(str, "*", 2, false, 4) != -1) && AbstractC2901.m4867(str, "*", 0, false, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(str).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat(str));
            }
            this.pattern = canonicalHost;
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1";
                C0516 c0516M1601 = C0348.m1601(str2.substring(5));
                if (c0516M1601 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
                }
                this.hash = c0516M1601;
                return;
            }
            if (!str2.startsWith("sha256/")) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
            }
            this.hashAlgorithm = "sha256";
            C0516 c0516M1602 = C0348.m1601(str2.substring(7));
            if (c0516M1602 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
            }
            this.hash = c0516M1602;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return AbstractC1469.m3322(this.pattern, pin.pattern) && AbstractC1469.m3322(this.hashAlgorithm, pin.hashAlgorithm) && AbstractC1469.m3322(this.hash, pin.hash);
        }

        public final C0516 getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + AbstractC2647.m4621(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            String str = this.hashAlgorithm;
            if (AbstractC1469.m3322(str, "sha256")) {
                return AbstractC1469.m3322(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (AbstractC1469.m3322(str, "sha1")) {
                return AbstractC1469.m3322(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            if (this.pattern.startsWith("**.")) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                if (!str.regionMatches(str.length() - length, this.pattern, 3, length)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!this.pattern.startsWith("*.")) {
                    return str.equals(this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = str.length() - length3;
                if (!str.regionMatches(str.length() - length3, this.pattern, 1, length3) || AbstractC2901.m4871(str, '.', length4 - 1, 4) != -1) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo1962();
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    /* JADX INFO: compiled from: obf */
    public static final class AnonymousClass1 extends AbstractC1778 implements InterfaceC1422 {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // p000.InterfaceC1422
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listClean, 10));
            Iterator<T> it = listClean.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final C0516 sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final C0516 sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        check$okhttp(str, new AnonymousClass1(list, str));
    }

    public final void check$okhttp(String str, InterfaceC1422 interfaceC1422) throws SSLPeerUnverifiedException {
        List<Pin> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC1422.invoke();
        for (X509Certificate x509Certificate : list) {
            C0516 c0516Sha256Hash = null;
            C0516 c0516Sha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (AbstractC1469.m3322(hashAlgorithm, "sha256")) {
                    if (c0516Sha256Hash == null) {
                        c0516Sha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (AbstractC1469.m3322(pin.getHash(), c0516Sha256Hash)) {
                        return;
                    }
                } else {
                    if (!AbstractC1469.m3322(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (c0516Sha1Hash == null) {
                        c0516Sha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (AbstractC1469.m3322(pin.getHash(), c0516Sha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return AbstractC1469.m3322(certificatePinner.pins, this.pins) && AbstractC1469.m3322(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String str) {
        List arrayList = C1191.f4326;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC2902.m4885(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        return AbstractC1469.m3322(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) {
        check(str, AbstractC0280.m1535(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, AbstractC0985 abstractC0985) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}
