import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChatRoom {
    private String id;            // 聊天室唯一 ID
    private List<String> members; // 聊天室成员 ID 列表
    private List<String> messages;

    // 构造方法
    public ChatRoom(String name, List<String> members, boolean isGroupChat, String createdBy) {
        this.id = UUID.randomUUID().toString(); // 生成唯一 ID
        this.name = (isGroupChat && name == null) ? "群聊-" + System.currentTimeMillis() : name;
        this.members = new ArrayList<>(members); // 复制成员列表
        this.isGroupChat = isGroupChat;
        this.createdBy = createdBy;
        this.createdAt = System.currentTimeMillis(); // 记录创建时间
    }

    // Getter 方法
    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getMembers() { return new ArrayList<>(members); } // 防止外部修改
    public boolean isGroupChat() { return isGroupChat; }
    public String getCreatedBy() { return createdBy; }
    public long getCreatedAt() { return createdAt; }

    // 添加成员
    public void addMember(String userId) {
        if (!members.contains(userId)) {
            members.add(userId);
        }
    }

    // 移除成员
    public void removeMember(String userId) {
        members.remove(userId);
    }

    // 判断用户是否在聊天室
    public boolean hasMember(String userId) {
        return members.contains(userId);
    }

    @Override
    public String toString() {
        return (isGroupChat ? "群聊：" : "私聊：") + name + "（ID: " + id + "，成员数: " + members.size() + "）";
    }
}