package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.List;

public class Dustbin {
        private String color;
        private List<Garbage> plasticGarbageList = new ArrayList<>();
        private List<Garbage> paperGarbageList = new ArrayList<>();
        private List<Garbage> garbageList = new ArrayList<>();

        public Dustbin(String color) {
                this.color = color;
        }

        public String getColor() {
                return color;
        }

        protected void throwOutGarbage(Garbage garbage) {
                try {
                        if (garbage.getClass().equals(PlasticGarbage.class)) {
                                if ((((PlasticGarbage) garbage).isClean())) {
                                        plasticGarbageList.add(garbage);
                                } else {
                                        throw new DustbinContentException("The plastic is not cleaned.");
                                }

                        } else if (garbage.getClass().equals(PaperGarbage.class)) {
                                if (((PaperGarbage) garbage).isSqueezed()){
                                        paperGarbageList.add(garbage);
                                }else {
                                        throw new DustbinContentException("The paper is not squeezed.");
                                }

                        } else if (garbage.getClass().equals(Garbage.class)) {
                                garbageList.add(garbage);
                        } else {
                                throw new DustbinContentException("Wrong garbage type");
                        }
                } catch (DustbinContentException ex) {
                        System.out.println(ex.getMessage());
                }


        }

        public int getHouseWasteCount() {
                return garbageList.size();
        }

        public int getPaperCount() {
                return paperGarbageList.size();
        }

        public int getPlasticCount() {
                return plasticGarbageList.size();
        }

        @Override
        public String toString() {
                StringBuilder result = new StringBuilder();

                result.append(color).append(" Dustbin!\n");
                result.append("House waste content: ").append(getHouseWasteCount()).append(" item(s)\n");

                for (int i = 0; i < garbageList.size(); i++) {
                        result.append("    ").append(garbageList.get(i).getName()).append(" nr.").append(i + 1).append("\n");
                }

                result.append("Paper content: ").append(getPaperCount()).append(" item(s)\n");

                for (int i = 0; i < paperGarbageList.size(); i++) {
                        result.append("    ").append(paperGarbageList.get(i).getName()).append(" nr.").append(i + 1).append("\n");
                }

                result.append("Plastic content: ").append(getPlasticCount()).append(" item(s)\n");

                for (int i = 0; i < plasticGarbageList.size(); i++) {
                        result.append("    ").append(plasticGarbageList.get(i).getName()).append(" nr.").append(i + 1).append("\n");
                }

                return result.toString();
        }

        public void emptyContents() {
                plasticGarbageList.clear();
                paperGarbageList.clear();
                garbageList.clear();
        }

        public void displayContents(Dustbin dustbin) {
                System.out.println(dustbin);
        }
}
