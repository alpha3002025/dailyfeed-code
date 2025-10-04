package click.dailyfeed.code.domain.activity.factory;

import click.dailyfeed.code.domain.activity.transport.MemberActivityTransportDto;
import click.dailyfeed.code.domain.activity.type.MemberActivityType;

import java.time.LocalDateTime;

public class MemberActivityTransferDtoFactory {
    public static MemberActivityTransportDto.MemberActivityEvent newPostMemberActivityTransportDto(Long memberId, Long postId, MemberActivityType activityType, LocalDateTime now) {
        return MemberActivityTransportDto.MemberActivityEvent.builder()
                .memberId(memberId)
                .postId(postId)
                .memberActivityType(activityType)
                .createdAt(now)
                .build();
    }

    public static MemberActivityTransportDto.MemberActivityEvent newCommentMemberActivityTransportDto(Long memberId, Long postId, Long commentId, MemberActivityType activityType, LocalDateTime now) {
        return MemberActivityTransportDto.MemberActivityEvent.builder()
                .memberId(memberId)
                .postId(postId)
                .commentId(commentId)
                .memberActivityType(activityType)
                .createdAt(now)
                .build();
    }

    public static MemberActivityTransportDto.MemberActivityEvent newPostLikeMemberActivityTransportDto(Long memberId, Long postId, MemberActivityType activityType, LocalDateTime now) {
        return MemberActivityTransportDto.MemberActivityEvent.builder()
                .memberId(memberId)
                .postId(postId)
                .memberActivityType(activityType)
                .createdAt(now)
                .build();
    }

    public static MemberActivityTransportDto.MemberActivityEvent newCommentLikeMemberActivityTransportDto(Long memberId, Long postId, Long commentId, MemberActivityType activityType, LocalDateTime now) {
        return MemberActivityTransportDto.MemberActivityEvent.builder()
                .memberId(memberId)
                .postId(postId)
                .commentId(commentId)
                .memberActivityType(activityType)
                .createdAt(now)
                .build();
    }

}
