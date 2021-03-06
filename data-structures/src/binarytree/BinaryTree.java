/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import exception.EmptyTreeException;
import exception.ValueNotFoundException;

/**
 *
 * @author a1402072
 */
public class BinaryTree {

    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {

        return this.root == null;

    }

    public void insert(int value) {

        TreeNode newNode = new TreeNode(value);

        if (this.isEmpty()) {

            this.root = newNode;

        } else {

            TreeNode temp = this.root;

            boolean wasInserted = false;

            while (!wasInserted) {

                if (newNode.getValue() <= temp.getValue()) {

                    if (temp.getLeft() == null) {

                        temp.setLeft(newNode);
                        wasInserted = true;

                    } else {

                        temp = temp.getLeft();

                    }

                } else if (temp.getRight() == null) {

                    temp.setRight(newNode);
                    wasInserted = true;

                } else {

                    temp = temp.getRight();

                }

            }

        }

    }

    public void showTree(TreeNode temp) {

        if (temp != null) {

            System.out.println(temp.getValue());
            showTree(temp.getLeft());
            showTree(temp.getRight());

        }

    }

    public void showLeaves(TreeNode temp) {

        if (temp != null) {

            showLeaves(temp.getLeft());

            showLeaves(temp.getRight());

            if (temp.getLeft() == null && temp.getRight() == null) {

                System.out.println(temp.getValue());

            }

        }

    }

    public int leafCount(TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() == null && temp.getRight() == null) {

                return 1;

            }

            return leafCount(temp.getLeft()) + leafCount(temp.getRight());

        }

        return 0;

    }

    public int nodeCount(TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() == null && temp.getRight() == null) {

                return 1;

            }

            return 1 + nodeCount(temp.getLeft()) + nodeCount(temp.getRight());

        }

        return 0;

    }

    public int sumValues(TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() == null && temp.getRight() == null) {

                return temp.getValue();

            }

            return temp.getValue() + sumValues(temp.getLeft()) + sumValues(temp.getRight());

        }

        return 0;

    }

    public int deepness(TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() == null && temp.getRight() == null) {

                return 1;

            }

            int x = deepness(temp.getLeft());
            int y = deepness(temp.getRight());

            if (x > y) {

                //System.out.println("valor: " + temp.getValue());
                //System.out.println("retornando: " + (1 + x));
                return 1 + x;

            } else {

                //System.out.println("valor: " + temp.getValue());
                //System.out.println("retornando: " + (1 + y));
                return 1 + y;

            }
        }

        return 0;

    }

    private int soonCount(TreeNode temp) {

        int count = 0;

        if (temp != null) {

            if (temp.getLeft() != null) {

                count++;

            }

            if (temp.getRight() != null) {

                count++;

            }

        }

        return count;

    }

    public void removeValue(int value, TreeNode temp) throws EmptyTreeException {

        if (temp != null) {

            try {

                temp = searchValue(value, temp);

                switch (soonCount(temp)) {

                    case 0:
                        removeLeaf(value, this.root);
                        break;
                    case 1:
                        removeOneSoon(value, this.root);
                        break;
                    case 2:
                        removeTwoSoons(value, this.root);
                        break;

                }

            } catch (ValueNotFoundException ex) {

                System.out.println(ex.getMessage());

            }

        }

    }

    private void removeLeaf(int value, TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() != null
                    && temp.getLeft().getValue() == value) {

                temp.setLeft(null);

            } else if (temp.getRight() != null
                    && temp.getRight().getValue() == value) {

                temp.setRight(null);

            } else {

                removeLeaf(value, temp.getLeft());
                removeLeaf(value, temp.getRight());

            }

        }

    }

    private void removeOneSoon(int value, TreeNode temp) {

        if (temp != null) {

            if (temp.getLeft() != null
                    && temp.getLeft().getValue() == value) {

                if (temp.getLeft().getLeft() != null) {

                    temp.setLeft(temp.getLeft().getLeft());

                } else {

                    temp.setLeft(temp.getLeft().getRight());

                }

            } else if (temp.getRight() != null
                    && temp.getRight().getValue() == value) {

                if (temp.getRight().getLeft() != null) {

                    temp.setRight(temp.getRight().getLeft());

                } else {

                    temp.setRight(temp.getRight().getRight());

                }

            } else {

                removeOneSoon(value, temp.getLeft());
                removeOneSoon(value, temp.getRight());

            }

        }

    }

    private void removeTwoSoons(int value, TreeNode temp) {

        if (temp.getValue() == value) {
            
            TreeNode aux = leftmostNode(temp.getRight());
            
            int newValue = aux.getValue();
            
            removeValue(aux.getValue(), temp);
            
            temp.setValue(newValue);
            
        } else {
            
            if (value < temp.getValue()) {
                
                removeTwoSoons(value, temp.getLeft());
                
            } else {
                
                removeTwoSoons(value, temp.getRight());
                
            }
            
        }

        

    }

    public TreeNode searchValue(int value, TreeNode temp) throws ValueNotFoundException {

        while (temp != null) {

            if (value == temp.getValue()) {

                return temp;

            } else if (value < temp.getValue()) {

                temp = temp.getLeft();

            } else {

                temp = temp.getRight();

            }

        }

        throw new ValueNotFoundException("Valor não encontrado!!");

    }
    
    private static TreeNode leftmostNode(TreeNode temp) {
        
        TreeNode aux;
        
        if (temp.getLeft() != null) {
            
            aux = leftmostNode(temp.getRight());
            
        } else {
            
            aux = temp;
            
        }
        
        return aux;
    }

}
