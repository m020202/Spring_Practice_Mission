package ext.javalab.umc7th_mission.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;
import javalab.umc7th_mission.domain.Review;


import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReview is a Querydsl query type for Review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReview extends EntityPathBase<Review> {

    private static final long serialVersionUID = -73969884L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReview review = new QReview("review");

    public final StringPath body = createString("body");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final ListPath<javalab.umc7th_mission.domain.ReviewImage, QReviewImage> reviewImageList = this.<javalab.umc7th_mission.domain.ReviewImage, QReviewImage>createList("reviewImageList", javalab.umc7th_mission.domain.ReviewImage.class, QReviewImage.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> score = createNumber("score", java.math.BigDecimal.class);

    public final QStore store;

    public QReview(String variable) {
        this(Review.class, forVariable(variable), INITS);
    }

    public QReview(Path<? extends Review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReview(PathMetadata metadata, PathInits inits) {
        this(Review.class, metadata, inits);
    }

    public QReview(Class<? extends Review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.store = inits.isInitialized("store") ? new QStore(forProperty("store"), inits.get("store")) : null;
    }

}

