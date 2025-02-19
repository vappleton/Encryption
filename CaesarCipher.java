class CaesarCipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }
    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) { // converts the input message into a character array and loops through each character 
            if(Character.isLetter(ch)) { // checks if the ch is a letter. If it isn't it stays unchanged
                char base = Character.isUpperCase(ch) ? 'A' : 'a';// if cg is uppercase, base is 'A' else it is 'a'
                encryptedMessage.append((char) ((ch - base + shift) % 26 + base)); //encryts character using Caesar Cipher formula and appends encrypted character
            } else {
                encryptedMessage.append(ch);
            }
        }
        return encryptedMessage.toString();
    }

    public String decrypt(String message) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if(Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                decryptedMessage.append((char) ((ch - base - shift + 26) % 26 + base));
            } else {
                decryptedMessage.append(ch);
            }
        }
        return decryptedMessage.toString();
    }
}
