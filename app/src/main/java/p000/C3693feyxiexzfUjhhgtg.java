package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3693feyxiexzfUjhhgtg extends AbstractC3694feyxiexzfUjhhgtg {
    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final byte mo5374Ujhhgtgfeyxiexzf() {
        return (byte) 6;
    }

    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo5375Ujhhgtgfeyxiexzf() {
        String str = (String) this.f11723Ujhhgtgfeyxiexzf;
        if (str == null) {
            return false;
        }
        return "true".equalsIgnoreCase(str);
    }

    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final float mo5376Ujhhgtgfeyxiexzf() {
        String str = (String) this.f11723Ujhhgtgfeyxiexzf;
        if (str == null || str.isEmpty()) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str.trim());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo5377Ujhhgtgfeyxiexzf() {
        String str = (String) this.f11723Ujhhgtgfeyxiexzf;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            return str.contains(".") ? (int) Double.parseDouble(str) : Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final long mo5378Ujhhgtgfeyxiexzf() {
        String str = (String) this.f11723Ujhhgtgfeyxiexzf;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            return str.contains(".") ? (long) Double.parseDouble(str) : Long.parseLong(str.trim());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // p000.AbstractC3686Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final String mo5379Ujhhgtgfeyxiexzf() {
        Object obj = this.f11723Ujhhgtgfeyxiexzf;
        return obj != null ? (String) obj : "";
    }
}
