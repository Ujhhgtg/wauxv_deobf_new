package bsh.snapshot;

import bsh.Node;
import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class BshSnapshot implements Serializable {
    public static final int FORMAT_VERSION = 1;
    private static final long serialVersionUID = 1;
    private final int formatVersion = 1;
    private final Node[] nodes;

    public BshSnapshot(Node[] nodeArr) {
        this.nodes = nodeArr;
    }

    public int getFormatVersion() {
        return this.formatVersion;
    }

    public Node[] getNodes() {
        return this.nodes;
    }
}
