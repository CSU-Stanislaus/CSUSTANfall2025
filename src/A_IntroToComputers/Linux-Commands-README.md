# Linux Commands – Quick Reference (README)

A concise, classroom‑friendly cheat sheet of the **most common Linux commands** with examples. Works on Ubuntu/Debian, Fedora/RHEL, Arch, and most distros (some package/systemctl details vary).

---

## 🧭 Navigation & File Ops

```bash
pwd                       # print working directory
ls -lah                   # list (long, all, human sizes)
cd /path/to/dir           # change directory
mkdir -p dir/subdir       # make directory (parents)
touch file.txt            # create empty file / update mtime
cp fileA fileB            # copy file
cp -r dirA dirB           # copy directory recursively
mv old new                # move/rename
rm file.txt               # remove file
rm -rf dir/               # ⚠️ remove directory recursively (dangerous)
```

**Globs**: `*` any, `?` one char, `[abc]` set, `{a,b}` alternates.  
Example: `rm *.log`, `cp img_{1..3}.png out/`

---

## 👀 View & Inspect Files

```bash
cat file.txt              # print whole file
tac file.txt              # reverse cat (bottom -> top)
nl -ba file.txt           # cat with line numbers
less file.txt             # paged view (q to quit, /search)
head -n 20 file.txt       # first lines
tail -n 50 file.txt       # last lines
tail -f app.log           # live follow
wc -lwm file.txt          # lines, words, bytes
stat file.txt             # metadata (size, perms, times)
file binary               # guess file type
```

---

## 🔎 Search & Text Processing

```bash
grep -Rni "pattern" .     # recursive, line numbers, case-insensitive
grep -E "re(g|x)p" file   # extended regex
cut -d',' -f1,3 data.csv  # pick columns 1 and 3
sort -u file.txt          # unique-sorted lines
uniq -c sorted.txt        # counts (needs adjacent duplicates)
tr '[:lower:]' '[:upper:]' < f   # transform
sed 's/old/new/g' file    # replace (print to stdout)
awk -F, '{sum+=$3} END{print sum}' data.csv  # sum 3rd column
xargs -I{} echo {}        # build commands from stdin
```

**Find files**:
```bash
find . -name "*.log" -size +10M
find /var -type f -mtime -1 -printf "%p %TY-%Tm-%Td\n"
```

---

## 🔁 Pipes & Redirection

```bash
cmd1 | cmd2               # pipe stdout of cmd1 to cmd2
cmd >> out.txt            # append stdout
cmd > out.txt             # overwrite stdout
cmd 2> err.txt            # stderr only
cmd > out.txt 2>&1        # stdout+stderr to file
tee -a log.txt            # write to screen and append file
```

---

## 👤 Users, Groups, Permissions

```bash
whoami                    # current user
id                        # uid, gid, groups
sudo <cmd>                # run as root (if configured)
adduser alice             # Debian/Ubuntu add user
useradd -m alice          # RHEL/Arch add user (then set password)
passwd alice              # set password
groups alice              # list groups
chown user:group file     # change owner
chmod 644 file            # rw-r--r--
chmod -R u+rwX,g+rX dir/  # recursive sensible add
umask                     # default permission mask
```

**Permission bits**: `r=4, w=2, x=1`. Example: `chmod 755 script.sh` → `rwxr-xr-x`

---

## 🧪 Processes & Jobs

```bash
ps aux | less             # process snapshot
top                       # live view (use h for help)
htop                      # nicer top (install may be needed)
pgrep -fl python          # match by name
kill -TERM <pid>          # graceful stop
kill -9 <pid>             # force kill (last resort)
jobs -l                   # background jobs in shell
sleep 100 &               # run in background
fg %1                     # bring job to foreground
nohup cmd &               # survive hangup
```

**Nice/priority**: `nice -n 10 cmd`, `renice 5 -p <pid>`

---

## 🌐 Networking

```bash
ip a                      # addresses
ip r                      # routes
ss -tulpn                 # sockets (like netstat)
ping -c 4 example.com     # ICMP ping
curl -I https://ex.com    # HTTP headers
curl -L -o file URL       # download (follow redirects)
wget URL                  # simple download
dig +short ex.com         # DNS lookup (apt install dnsutils/bind-utils)
scp file user@host:/path  # secure copy
ssh user@host             # remote shell (keys in ~/.ssh)
```

**Port test**: `nc -vz host 443` (may need `netcat`).

---

## 📦 Package Management (by distro)

**Debian/Ubuntu**
```bash
sudo apt update && sudo apt upgrade
sudo apt install htop curl git
sudo apt remove pkg && sudo apt autoremove
```

**Fedora/RHEL/CentOS (dnf/yum)**
```bash
sudo dnf update
sudo dnf install htop curl git
sudo dnf remove pkg
```

**Arch/Manjaro**
```bash
sudo pacman -Syu
sudo pacman -S htop curl git
sudo pacman -R pkg
```

---

## 🗄️ Disk, Filesystems & Archives

```bash
df -h                     # disk usage by filesystem
du -sh *                  # size of items in current dir
lsblk                     # block devices
mount | column -t         # mounted filesystems
sudo mount /dev/sdb1 /mnt # mount device
tar -czf out.tgz dir/     # create gzip tar
tar -xzf out.tgz          # extract
zip -r out.zip dir/       # zip directory
unzip out.zip             # unzip
```

---

## 🕒 Systemctl & Logs (systemd)

```bash
systemctl status          # system summary
systemctl status nginx    # service status
sudo systemctl start nginx
sudo systemctl enable nginx
journalctl -u nginx --since "1 hour ago"   # service logs
journalctl -f             # follow system logs
```

*(Non‑systemd distros use `service`, `rc.d`, or OpenRC equivalents.)*

---

## 🧰 Dev Helpers

```bash
which cmd                 # path to cmd
type cmd                  # builtin/external? and where
env | sort                # environment variables
export KEY=value          # set env var (current shell)
alias ll='ls -lah'        # quick alias
history | tail -n 20      # recent commands
time cmd                  # measure runtime
```

**Editors**: `nano file`, `vim file`, `code .` (VS Code).

---

## 🐳 Optional: Docker Basics

```bash
docker ps                 # running containers
docker images             # images
docker run --rm -it alpine sh
docker exec -it <name> bash
docker logs -f <name>
```

---

## ⚠️ Common Foot‑Guns (Use with care)

| Command | Why risky |
|---|---|
| `rm -rf /some/path` | Recursively deletes—typos can wipe data. |
| `chmod -R 777` | Over‑permissive; security risk. |
| `curl … | sh` | Executes remote code blindly. Prefer review & checksums. |
| `kill -9 <pid>` | Skips cleanup; can corrupt files. |

---

## 🧪 Quick Practice

1. Create a project folder, add two files, and archive it:
   ```bash
   mkdir -p proj/src && touch proj/README.md proj/src/main.c
   tar -czf proj.tgz proj && du -sh proj.tgz
   ```
2. Find all `.log` files > 5MB and delete after confirmation:
   ```bash
   find . -name "*.log" -size +5M -print0 | xargs -0 -p rm
   ```
3. Fetch a web page and count unique words:
   ```bash
   curl -sL https://example.com | tr -cs '[:alnum:]' '\n' | tr '[:upper:]' '[:lower:]' | sort | uniq -c | sort -nr | head
   ```

---

### Tips
- Use `--help` and `man <cmd>` for detailed options.
- Combine small commands with pipes to solve bigger tasks.
- Prefer readable one‑liners you (and teammates) can maintain.
