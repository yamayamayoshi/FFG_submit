//Main�N���X�̍쐬
package com.github.finder;

public class Main{
    public Main(String[] arguments){
    }

    public static void main(String[] args){
        new Main(args);
    }
}
//�R�}���h���C���I�v�V��������͂���R�}���h�̒ǉ�
 private Args parseArguments(String[] arguments){
        Args args = new Args();
        try {
            CmdLineParser parser = new CmdLineParser(args);
            parser.parseArgument(arguments);
        } catch (CmdLineException e) {
        }
        return args;
    }
