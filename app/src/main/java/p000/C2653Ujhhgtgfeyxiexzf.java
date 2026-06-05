package p000;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2653Ujhhgtgfeyxiexzf extends AbstractC2471feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public RequestBody f8512Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public MultipartBody.Builder f8513Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public FormBody.Builder f8514Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public MediaType f8515Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8516Ujhhgtgfeyxiexzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r1v1, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r1v6, types: [okhttp3.FormBody] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [okhttp3.Request$Builder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC2471feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Request mo3709Ujhhgtgfeyxiexzf() {
        MultipartBody.Builder builder = this.f8513Ujhhgtgfeyxiexzf;
        ?? Build = this.f8512Ujhhgtgfeyxiexzf;
        if (Build == 0) {
            Build = this.f8514Ujhhgtgfeyxiexzf.build();
            try {
                builder.build();
                int size = Build.size();
                for (int i = 0; i < size; i++) {
                    builder.addFormDataPart(Build.name(i), Build.value(i));
                }
                Build = builder.setType(this.f8515Ujhhgtgfeyxiexzf).build();
            } catch (IllegalStateException unused) {
            }
        }
        Request.Builder builderUrl = this.f8005Ujhhgtgfeyxiexzf.method(AbstractC3317feyxiexzfUjhhgtg.m4810Ujhhgtgfeyxiexzf(this.f8516Ujhhgtgfeyxiexzf), Build).url(this.f8002Ujhhgtgfeyxiexzf.build());
        builderUrl.tag(C0428Ujhhgtgfeyxiexzf.class, this.f8003Ujhhgtgfeyxiexzf);
        return builderUrl.build();
    }
}
