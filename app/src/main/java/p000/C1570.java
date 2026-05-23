package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1570 extends AbstractC0054 {

    public static final Pattern[][] f5457 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    public final Pattern f5459;

    public final C1569 f5458 = new C1569(0);

    public boolean f5460 = false;

    public C0408 f5461 = new C0408((byte) 0, 2);

    public C1570(Pattern pattern) {
        this.f5459 = pattern;
    }

    @Override // p000.AbstractC0054
    public final void mo917(CharSequence charSequence) {
        C0408 c0408 = this.f5461;
        StringBuilder sb = (StringBuilder) c0408.f1922;
        if (c0408.f1921 != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        c0408.f1921++;
        Pattern pattern = this.f5459;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f5460 = true;
    }

    @Override // p000.AbstractC0054
    public final void mo919() {
        ((StringBuilder) this.f5461.f1922).toString();
        
        this.f5461 = null;
    }

    @Override // p000.AbstractC0054
    public final AbstractC0428 mo920() {
        return this.f5458;
    }

    @Override // p000.AbstractC0054
    public final C0429 mo923(C1088 c1088) {
        if (this.f5460) {
            return null;
        }
        if (c1088.f3918 && this.f5459 == null) {
            return null;
        }
        return C0429.m1634(c1088.f3912);
    }
}
