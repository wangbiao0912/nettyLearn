package com.after00.im.protocol.response;

import com.after00.im.protocol.Packet;
import com.after00.im.session.Session;
import lombok.Data;

import static com.after00.im.protocol.command.Command.GROUP_MESSAGE_RESPONSE;


@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
