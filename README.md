
```markdown
# 💬✨ JAVA CONSOLE CHAT APPLICATION

> A multi-client console-based chat system using Java Sockets & Multithreading  
> 🛠️ Developed with focus on modularity, error handling, and clean architecture

---

## 🚀 FEATURES

✅ **Server-Client Setup** – Start the server once and connect multiple clients  
✅ **Message Broadcasting** – Messages from one client are sent to all others  
✅ **Multithreaded Communication** – Each client runs in a separate thread  
✅ **Input Validation** – Ensures valid integers using `InputValidator`  
✅ **Robust Error Handling** – Try-catch blocks to avoid crashes  
✅ **Modular Design** – Clear separation of concerns (Server, Client, Handler)  
✅ **Clean Code** – Well-documented and structured codebase  

---

## 🧠 CORE COMPONENTS

| 🧩 Component           | 🔍 Description                                       |
|------------------------|------------------------------------------------------|
| 🔌 Server/Client Setup | Establishes reliable socket communication            |
| 🔁 Broadcasting        | Sends messages from one client to all connected peers|
| 🧵 Thread Management   | Handles clients using Java Threads                   |
| ✅ Input Validation     | Ensures only valid integer input is accepted        |
| 🛡️ Error Handling       | Prevents crashes and unexpected termination         |
| 🗃️ Modular Code         | Separated by responsibility for better maintenance |

---

## 📁 PROJECT STRUCTURE

```

Chat\_app2/
├── ChatServer.java        # Server-side logic for handling clients
├── ChatClient.java        # Client-side messaging interface
├── ClientHandler.java     # Handles individual client sessions (Thread-based)
├── InputValidator.java    # Validates numerical input
├── Main.java              # Entry point: chooses between server/client mode

````

---

## ⚙️ HOW TO RUN (VS CODE / TERMINAL)

1️⃣ Open terminal & navigate to the folder  
```bash
cd path\to\Chatting
````

2️⃣ Compile all Java files

```bash
javac *.java
```

3️⃣ Run the application

```bash
java Main
```

4️⃣ On prompt:

* Enter `1` to start the server
* Enter `2` to start a client (you can open multiple terminals for more clients)

---

## 👥 TEAM MEMBERS

> **Tejasv Agarwal (24SCSE1010152)**    **Daksh Sajwan (24SCSE1011382)**    **Ashutosh Pandey (24SCSE1010907)**    **Raushan Raj (24SCSE1011535)**

---

