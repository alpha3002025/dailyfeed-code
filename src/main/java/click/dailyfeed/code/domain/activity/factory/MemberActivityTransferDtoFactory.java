package click.dailyfeed.code.domain.activity.factory;

import click.dailyfeed.code.domain.activity.transport.MemberActivityTransportDto;
import click.dailyfeed.code.domain.activity.type.MemberActivityType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MemberActivityTransferDtoFactory {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS");

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

    public static MemberActivityTransportDto.MemberActivityMessage newMemberActivityMessage(MemberActivityTransportDto.MemberActivityEvent event, MemberActivityType activityType, LocalDateTime now) {
        String key = messageKey(activityType, event, now);
        return MemberActivityTransportDto.MemberActivityMessage.builder()
                .key(key)
                .event(event)
                .build();
    }

    public static String messageKey(MemberActivityType activityType, MemberActivityTransportDto.MemberActivityEvent event, LocalDateTime now) {
        switch (activityType) {
            case POST_CREATE -> {
                return new StringBuffer()
                        .append(event.getPostId()).append("###")
                        .append(event.getMemberId())
                        .toString();
            }
            case POST_UPDATE, POST_DELETE, POST_READ -> {
                return new StringBuffer()
                        .append(activityType.getCode()).append("###") // redis 에서 중복 메시지 여부 구분을 위해 추가
                        .append(event.getPostId()).append("###")
                        .append(event.getMemberId()).append("###")
                        .append(now.format(DATE_TIME_FORMATTER))
                        .toString();
            }
            case COMMENT_CREATE -> {
                return new StringBuffer()
                        .append(activityType.getCode()).append("###") // redis 에서 중복 메시지 여부 구분을 위해 추가
                        .append(event.getCommentId()).append("###")
                        .append(event.getMemberId())
                        .toString();
            }
            case COMMENT_UPDATE, COMMENT_DELETE, COMMENT_READ -> {
                return new StringBuffer()
                        .append(activityType.getCode()).append("###") // redis 에서 중복 메시지 여부 구분을 위해 추가
                        .append(event.getCommentId()).append("###")
                        .append(event.getMemberId()).append("###")
                        .append(now.format(DATE_TIME_FORMATTER))
                        .toString();
            }
            case LIKE_POST, LIKE_POST_CANCEL -> {
                return new StringBuffer()
                        .append(activityType.getCode()).append("###") // redis 에서 중복 메시지 여부 구분을 위해 추가
                        .append(event.getPostId()).append("###")
                        .append(event.getMemberId())
                        .toString();
            }
        }
        return null;
    }
}
