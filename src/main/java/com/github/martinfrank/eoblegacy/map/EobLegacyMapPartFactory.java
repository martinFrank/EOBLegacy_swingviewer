package com.github.martinfrank.eoblegacy.map;


import com.github.martinfrank.maplib2.map.Edge;
import com.github.martinfrank.maplib2.map.Field;
import com.github.martinfrank.maplib2.map.MapPartFactory;
import com.github.martinfrank.maplib2.map.Node;

public class EobLegacyMapPartFactory implements MapPartFactory<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> {

    @Override
    public EobLegacyMapField createField(Field<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> field) {
        return new EobLegacyMapField(field);
    }

    @Override
    public EobLegacyMapEdge createEdge(Edge<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> edge) {
        return new EobLegacyMapEdge(edge);
    }

    @Override
    public EobLegacyMapNode createNode(Node<EobLegacyMapField, EobLegacyMapEdge> node) {
        return new EobLegacyMapNode(node);
    }
}
