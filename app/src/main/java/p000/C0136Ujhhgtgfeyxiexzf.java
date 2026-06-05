package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能要点脸ᛳᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0136Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean f1293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean f1294Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final boolean f1295Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f1296Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f1297Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f1298Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final int f1299Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f1300Ujhhgtgfeyxiexzf;

    public C0136Ujhhgtgfeyxiexzf(boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, int i, boolean z5) {
        this.f1293Ujhhgtgfeyxiexzf = z;
        this.f1294Ujhhgtgfeyxiexzf = z2;
        this.f1295Ujhhgtgfeyxiexzf = z3;
        this.f1296Ujhhgtgfeyxiexzf = str;
        this.f1297Ujhhgtgfeyxiexzf = str2;
        this.f1298Ujhhgtgfeyxiexzf = z4;
        this.f1299Ujhhgtgfeyxiexzf = i;
        this.f1300Ujhhgtgfeyxiexzf = z5;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.f1293Ujhhgtgfeyxiexzf);
        sb.append(", isLenient=false, allowStructuredMapKeys=false, prettyPrint=");
        sb.append(this.f1294Ujhhgtgfeyxiexzf);
        sb.append(", explicitNulls=");
        sb.append(this.f1295Ujhhgtgfeyxiexzf);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f1296Ujhhgtgfeyxiexzf);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f1297Ujhhgtgfeyxiexzf);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f1298Ujhhgtgfeyxiexzf);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i = this.f1299Ujhhgtgfeyxiexzf;
        if (i == 1) {
            str = "NONE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "POLYMORPHIC";
        } else {
            str = "ALL_JSON_OBJECTS";
        }
        sb.append(str);
        sb.append(", exceptionsWithDebugInfo=");
        sb.append(this.f1300Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
