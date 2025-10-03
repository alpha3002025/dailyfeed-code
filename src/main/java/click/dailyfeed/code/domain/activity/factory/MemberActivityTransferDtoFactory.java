package click.dailyfeed.code.domain.activity.factory;

import click.dailyfeed.code.domain.activity.transport.MemberActivityTransportDto;
import click.dailyfeed.code.domain.activity.type.MemberActivityType;

public class MemberActivityTransferDtoFactory {
    public static MemberActivityTransportDto.MemberActivityEvent newMemberPostActivityTransportDto(Long memberId, Long postId, MemberActivityType activityType) {
        return MemberActivityTransportDto.MemberActivityEvent.builder()
                .memberId(memberId)
                .postId(postId)
                .memberActivityType(activityType)
                .build();
    }
}
