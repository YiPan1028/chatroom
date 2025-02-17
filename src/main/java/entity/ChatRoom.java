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
        this.members = new ArrayList<>(members); // 复制成员列表
        this.messages = new ArrayList<>();
    }

    // Getter 方法
    public String getId() { return id; }
    public List<String> getMembers() { return new ArrayList<>(members); } // 防止外部修改
    public List<String> getMessages() { return new ArrayList<>(messages); }

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
        return ("ID: " + id + "，成员数: " + members.size());
    }
}