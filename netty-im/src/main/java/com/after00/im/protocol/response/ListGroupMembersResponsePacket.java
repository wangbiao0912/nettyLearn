package com.after00.im.protocol.response;

import com.after00.im.protocol.Packet;
import com.after00.im.session.Session;
import lombok.Data;

import java.util.List;

import static com.after00.im.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;


@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
