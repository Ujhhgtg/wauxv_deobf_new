package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class Edge {
    final Edge nextEdge;
    final Label successor;

    public Edge(Label label, Edge edge) {
        this.successor = label;
        this.nextEdge = edge;
    }
}
