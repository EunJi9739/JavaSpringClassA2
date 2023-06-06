package org.koreait.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardViews is a Querydsl query type for BoardViews
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardViews extends EntityPathBase<BoardViews> {

    private static final long serialVersionUID = 595669874L;

    public static final QBoardViews boardViews = new QBoardViews("boardViews");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath uid = createString("uid");

    public QBoardViews(String variable) {
        super(BoardViews.class, forVariable(variable));
    }

    public QBoardViews(Path<? extends BoardViews> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardViews(PathMetadata metadata) {
        super(BoardViews.class, metadata);
    }

}

